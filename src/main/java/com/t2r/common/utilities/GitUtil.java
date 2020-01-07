package com.t2r.common.utilities;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevSort;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.filter.CommitTimeRevFilter;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import io.vavr.control.Try;

public class GitUtil {


    /**
     *
     * @param cloneLink Git clone Url
     * @param path Where to clone or find
     * @return Git repository
     */
    public static Try<Git> tryToClone(String cloneLink, Path path) {
        return Try.of(() -> Git.open(path.toFile()))
                .onFailure(e -> System.out.println("Did not find " + cloneLink + " at" + path.toString()))
                .orElse(Try.of(() ->
                        Git.cloneRepository().setURI(cloneLink).setDirectory(path.toFile()).call()))
                .onFailure(e -> System.out.println("Could not clone " + cloneLink));

    }


    /**
     *
     * @param git The Git repository
     * @param order order for output commits
     * @param fromDate first commit date
     * @return list of @RevCommit
     */
    public static List<RevCommit> getCommits(Git git, RevSort order, Date fromDate, List<String> except, List<String> only) {
        return Try.of(() -> {
            RevWalk walk = new RevWalk(git.getRepository());
            walk.markStart(walk.parseCommit(git.getRepository().resolve("HEAD")));
            walk.sort(order);
            walk.setRevFilter(CommitTimeRevFilter.after(fromDate));
            return walk;
        })
                .map(walk -> {
                    Iterator<RevCommit> iter = walk.iterator();
                    List<RevCommit> l = new ArrayList<>();
                    while(iter.hasNext()){
                        l.add(iter.next()); }
                    walk.dispose();
                    return l;
                })
                .onSuccess(l -> System.out.println(l.size() + " number of commits found for " + git.getRepository().getDirectory().getParent()))
                .onFailure(Throwable::printStackTrace)

                .getOrElse(new ArrayList<>())

                .stream()
                .filter(x -> !except.contains(x.getId().getName()))
                .filter(x -> only.isEmpty() || only.contains(x.getId().getName()))
                .collect(Collectors.toList());
    }

    /**
     *
     * @param git the Git repository
     * @param c the commit
     * @return DiffEntry for the commit
     */
    public static List<DiffEntry> getDiffEntries(Git git, RevCommit c)  {
        try {

            List<DiffEntry> ds = git.diff().setOldTree(prepareTreeParser(c.getParent(0).getId().getName(), git.getRepository()))
                    .setNewTree(prepareTreeParser(c.getId().getName(), git.getRepository()))
                    .call();
            return ds;
        }catch (Exception e){
            System.out.println("Could not generate git diff");
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    /**
     *
     * @param git the Git repository
     * @param c the commit
     * @return is successful checkout
     */
    public static boolean checkoutCommit(Git git, RevCommit c) {
        return Try.of(() -> git.checkout().setName(c.getId().getName()).call())
                .onFailure(Throwable::printStackTrace).isSuccess();
    }


   private static CanonicalTreeParser prepareTreeParser(String sha, Repository repository) throws
            IOException {
        RevWalk walk = new RevWalk(repository) ;
        RevCommit commit = walk.parseCommit(repository.resolve(sha));
        RevTree tree = walk.parseTree(commit.getTree().getId());
        CanonicalTreeParser treeParser = new CanonicalTreeParser();
        ObjectReader reader = repository.newObjectReader();
        treeParser.reset(reader, tree.getId());
        walk.dispose();
        return treeParser;
    }


}