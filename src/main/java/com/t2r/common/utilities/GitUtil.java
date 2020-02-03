package com.t2r.common.utilities;

import static com.t2r.common.utilities.FileUtils.createFolderIfAbsent;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

import org.apache.commons.io.IOUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectLoader;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevSort;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.filter.CommitTimeRevFilter;
import org.eclipse.jgit.revwalk.filter.RevFilter;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.eclipse.jgit.treewalk.TreeWalk;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.control.Try;

public class GitUtil {


    /**
     * @param cloneLink Git clone Url
     * @param path      Where to clone or find
     * @return Git repository
     */
    public static Try<Git> tryToClone(String cloneLink, Path path) {
        createFolderIfAbsent(path);
        return Try.of(() -> Git.open(path.toFile()))
                .onFailure(e -> System.out.println("Did not find " + cloneLink + " at" + path.toString()))
                .orElse(Try.of(() ->
                        Git.cloneRepository().setURI(cloneLink).setDirectory(path.toFile()).call()))
                .onFailure(e -> System.out.println("Could not clone " + cloneLink));

    }


    /**
     * @param git      The Git repository
     * @param order    order for output commits
     * @param fromDate first commit date
     * @return list of @RevCommit
     */
    public static List<RevCommit> getCommits(Git git, RevSort order, Date fromDate, List<String> except, List<String> only) {
        List<RevCommit> commits = Try.of(() -> {
            RevWalk walk = new RevWalk(git.getRepository());
            walk.markStart(walk.parseCommit(git.getRepository().resolve("HEAD")));
            walk.sort(order);
            walk.setRevFilter(CommitTimeRevFilter.after(fromDate));
            walk.setRevFilter(RevFilter.NO_MERGES);
            return walk;
        })
                .map(walk -> {
                    Iterator<RevCommit> iter = walk.iterator();
                    List<RevCommit> l = new ArrayList<>();
                    while (iter.hasNext()) {
                        l.add(iter.next());
                    }
                    walk.dispose();
                    return l;
                })
                .onSuccess(l -> System.out.println(l.size() + " number of commits found for " + git.getRepository().getDirectory().getParentFile().getName()))
                .onFailure(Throwable::printStackTrace)

                .getOrElse(new ArrayList<>())

                .stream()
                .filter(x -> !except.contains(x.getId().getName()))
                .filter(x -> only.isEmpty() || only.contains(x.getId().getName()))
                .collect(toList());
        Collections.reverse(commits);
        return commits;
    }

    /**
     * @param git the Git repository
     * @param c   the commit
     * @return DiffEntry for the commit
     */
    public static List<DiffEntry> getDiffEntries(Git git, RevCommit c) {
        return Try.of(() -> git.diff().setOldTree(prepareTreeParser(c.getParent(0).getId().getName(), git.getRepository()))
                .setNewTree(prepareTreeParser(c.getId().getName(), git.getRepository()))
                .call())
                .onFailure(Throwable::printStackTrace)
                .getOrElse(new ArrayList<>());
    }


    public static Map<DiffEntry.ChangeType, List<Tuple2<String, String>>> filePathDiffAtCommit(Git git, RevCommit cmt) {
        return getDiffEntries(git, cmt).stream()
                .map(x -> Tuple.of(x.getChangeType(), x.getOldPath(), x.getNewPath()))
                .collect(groupingBy(Tuple3::_1
                        , collectingAndThen(toList(), l -> l.stream().map(x -> Tuple.of(x._2(), x._3())).collect(toList()))));
    }


    public static Map<DiffEntry.ChangeType, List<Tuple2<String, String>>> filePathDiffAtCommit(Git git, String c) {
        return findCommit(c, git.getRepository())
                .map(cmt -> filePathDiffAtCommit(git, cmt))
                .orElse(new HashMap<>());
    }

    public static Tuple3<Map<Path, String>, Map<Path, String>, Map<Path, String>> getFilesAddedRemovedRenamedModified(Git git, RevCommit currentCommit, RevCommit parentCommit) throws IOException {

        var afterPaths = filePathDiffAtCommit(git, currentCommit).entrySet().stream()
                .filter(x -> x.getKey().equals(DiffEntry.ChangeType.ADD)
                        || x.getKey().equals(DiffEntry.ChangeType.MODIFY) || x.getKey().equals(DiffEntry.ChangeType.RENAME))
                .flatMap(x -> x.getValue().stream().map(Tuple2::_2))
                .collect(toList());

        var afterPathContent = populateFileContents(git.getRepository(), currentCommit, x -> true)
                .entrySet().stream()
                .collect(groupingBy(x -> afterPaths.stream().anyMatch(p -> x.getKey().toAbsolutePath().toString().contains(p))
                        , toMap(x -> x.getKey(), x -> x.getValue())));

        var beforePaths = filePathDiffAtCommit(git, currentCommit).entrySet().stream()
                .filter(x -> x.getKey().equals(DiffEntry.ChangeType.DELETE)
                        || x.getKey().equals(DiffEntry.ChangeType.MODIFY) || x.getKey().equals(DiffEntry.ChangeType.RENAME))
                .flatMap(x -> x.getValue().stream().map(Tuple2::_1))
                .collect(toList());

        var beforePathContent = populateFileContents(git.getRepository(), parentCommit
                , f -> beforePaths.stream().anyMatch(f::contains));

        return Tuple.of(beforePathContent, afterPathContent.get(true), afterPathContent.get(false));
    }


    /**
     * @param git the Git repository
     * @param c   the commit
     * @return is successful checkout
     */
    public static boolean checkoutCommit(Git git, RevCommit c) {
        return Try.of(() -> git.checkout().setName(c.getId().getName()).call())
                .onFailure(Throwable::printStackTrace).isSuccess();
    }


    private static CanonicalTreeParser prepareTreeParser(String sha, Repository repository) throws
            IOException {
        RevWalk walk = new RevWalk(repository);
        RevCommit commit = walk.parseCommit(repository.resolve(sha));
        RevTree tree = walk.parseTree(commit.getTree().getId());
        CanonicalTreeParser treeParser = new CanonicalTreeParser();
        ObjectReader reader = repository.newObjectReader();
        treeParser.reset(reader, tree.getId());
        walk.dispose();
        return treeParser;
    }


    public static Optional<RevCommit> findCommit(String SHAId, Repository repo) {

        List<RevCommit> mergeCommits = Try.of(() -> {
            RevWalk walk = new RevWalk(repo);
            walk.markStart(walk.parseCommit(repo.resolve("HEAD")));
            walk.setRevFilter(RevFilter.ONLY_MERGES);
            return walk;
        }).map(walk -> {
            Iterator<RevCommit> iter = walk.iterator();
            List<RevCommit> l = new ArrayList<>();
            while (iter.hasNext()) {
                l.add(iter.next());
            }
            walk.dispose();
            return l;
        }).getOrElse(new ArrayList<>());

        if (mergeCommits.stream().anyMatch(x -> x.getId().getName().equals(SHAId)))
            return Optional.empty();
        return Try.of(() -> new RevWalk(repo))
                .flatMap(x -> {
                    return Try.of(() -> x.parseCommit(ObjectId.fromString(SHAId)));
                })
                .onFailure(e -> e.printStackTrace())
                .toJavaOptional();
    }

    /**
     * @param repository Git repo
     * @param cmt        the particular commit
     * @param pred       matcher for files to populate the content for
     * @return filePath * content
     */
    public static Map<Path, String> populateFileContents(Repository repository, String cmt,
                                                         Predicate<String> pred) throws IOException {
        Map<Path, String> fileContents = new HashMap<>();
        Optional<RevCommit> commit = findCommit(cmt, repository);
        if (commit.isPresent()) {
            populateFileContents(repository, commit.get(), pred);
        }
        return fileContents;
    }


    public static Map<Path, String> populateFileContents(Repository repository, RevCommit cmt,
                                                         Predicate<String> pred) throws IOException {
        Map<Path, String> fileContents = new HashMap<>();
        RevTree parentTree = cmt.getTree();
        try (TreeWalk treeWalk = new TreeWalk(repository)) {
            treeWalk.addTree(parentTree);
            treeWalk.setRecursive(true);
            while (treeWalk.next()) {
                String pathString = treeWalk.getPathString();
                if (pred.test(pathString)) {
                    ObjectId objectId = treeWalk.getObjectId(0);
                    ObjectLoader loader = repository.open(objectId);
                    StringWriter writer = new StringWriter();
                    IOUtils.copy(loader.openStream(), writer);
                    fileContents.put(Paths.get(pathString), writer.toString());
                }
            }
        }
        return fileContents;
    }


    public static boolean isFileAffected(Git git, String c, Predicate<String> fileMatcher) {
        return filePathDiffAtCommit(git, c).values().stream()
                .flatMap(x -> x.stream())
                .anyMatch(x -> (x._1() != null && fileMatcher.test(x._1())) || (x._2() != null && fileMatcher.test(x._2())));
    }


}