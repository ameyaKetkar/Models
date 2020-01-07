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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import io.vavr.control.Try;

public class GitUtil {


    /**
     *
     * @param projectName Name of the project
     * @param cloneLink Git clone Url
     * @param path Where to clone or find
     * @return Git repository
     */
    public static Try<Git> tryToClone(String projectName, String cloneLink, String path) {
        return Try.of(() -> Git.open(new File(path + projectName)))
                .onFailure(e -> System.out.println("Did not find " + projectName + " at" + path))
                .orElse(Try.of(() ->
                        Git.cloneRepository().setURI(cloneLink).setDirectory(new File(path + projectName)).call()))
                .onFailure(e -> System.out.println("Could not clone " + projectName));

    }


    /**
     *
     * @param git The Git repository
     * @param order order for output commits
     * @param fromDate first commit date
     * @return list of @RevCommit
     */
    public static List<RevCommit> getCommits(Git git, RevSort order, Date fromDate) {
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
                .onSuccess(l -> System.out.println("Total number of commits found : " + l.size()))
                .onFailure(Throwable::printStackTrace)

                .getOrElse(new ArrayList<>());
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