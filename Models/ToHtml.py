import shutil

import RW
from jinja2 import Environment, FileSystemLoader
import os

pathToPages = os.path.join(os.path.dirname(os.path.realpath('__file__')), "../../docs/Pages")
pathToProjectsHtml = os.path.join(pathToPages, "../../docs/Pages/projects.html")

env = Environment(loader=FileSystemLoader(os.path.dirname(os.path.realpath('__file__'))))
template = env.get_template("ProjectTemplate.html")
commmitTemplate = env.get_template("CommitSummaryTemplate.html")
detailedCommmitTemplate = env.get_template("DetailCommitTemplate.html")

projects = RW.readProject('projects')
items = []

if os.path.isdir(pathToPages):
    shutil.rmtree(pathToPages)
try:
    os.mkdir(pathToPages)
except OSError:
    print("Could not make directory")

for p in projects:
    commits = RW.readCommit('commits_' + p.name)
    l = str(len(commits))
    d = dict(name=p.name, Url=p.url, totalCommits=p.totalCommits, CommitsAnalyzed=l,
             LinkToCommits=p.name + ".html")
    items.append(d)
    commitSummary = []
    for cmt in commits:
        r = sum(list(map(lambda r: r.occurences, cmt.refactorings)))
        refactorings = []
        dependencies = []
        added = []
        removed = []
        updated = []

        for dep in cmt.dependencies:
            dependencies.append(dict(name=dep.artifactID + ":" + dep.groupID + ":" + dep.version))

        for dep in cmt.dependencyUpdate.added:
            added.append(dict(name=dep.artifactID + ":" + dep.groupID + ":" + dep.version))

        for dep in cmt.dependencyUpdate.removed:
            removed.append(dict(name=dep.artifactID + ":" + dep.groupID + ":" + dep.version))

        for dep in cmt.dependencyUpdate.update:
            updated.append(dict(
                name="From " + dep.before.artifactID + ":" + dep.before.groupID + "   " + dep.before.version + " To " + dep.after.version))

        depChanged = len(added) + len(removed) + len(updated) > 0

        commitSummary.append(dict(sha=cmt.sha, noOfJars=str(len(cmt.dependencies)),
                                  refactoringsLink=p.name + "/" + cmt.sha + ".html" if r > 0 or depChanged else None,
                                  noOfRefactoring=str(r),
                                  typeChangeFound='Yes' if cmt.isTypeChangeReported else 'No',
                                  dependenciesChanged='Yes' if depChanged else 'No',
                                  isException='Yes' if (cmt.exception is not '') else 'No'))

        for ref in cmt.refactorings:
            descrptions = []
            # print(type(ref.descriptionAndurl))
            for k, v in ref.descriptionAndurl.items():
                descrptions.append(dict(description=k, frm=v.lhs, to=v.rhs))
            if descrptions is []:
                refactorings.append(dict(name=ref.name, occurence=ref.occurences, num=0))
            else:
                refactorings.append(
                    dict(name=ref.name, occurence=ref.occurences, descriptions=descrptions,
                         num=len(descrptions)))

        if len(refactorings) > 0 or depChanged:
            pathToCommitsInProject = os.path.join(pathToPages, p.name)
            pathToDetailedCommits = os.path.join(pathToCommitsInProject, cmt.sha + ".html")
            os.makedirs(os.path.dirname(pathToDetailedCommits), exist_ok=True)
            with open(pathToDetailedCommits, 'w+') as fh:
                fh.write(
                    detailedCommmitTemplate.render(sha=cmt.sha, filesAdded=cmt.fileDiff.filesAdded,
                                                   filesRemoved=cmt.fileDiff.filesRemoved,
                                                   filesRenamed=cmt.fileDiff.filesRenamed,
                                                   filesModified=cmt.fileDiff.filesModified,
                                                   refactorings=refactorings,
                                                   dependencies=dependencies, projectName=p.name,
                                                   Added=added if added is not [] else None,
                                                   AddedNum=len(added),
                                                   Removed=removed if removed is not [] else None,
                                                   RemovedNum=len(removed),
                                                   Updated=updated if updated is not [] else None,
                                                   UpdatedNum=len(updated)))
                fh.write('\n')

    pathToProjectCommits = os.path.join(pathToPages, p.name + ".html")
    with open(pathToProjectCommits, 'a') as fh:
        fh.write(commmitTemplate.render(projectName=p.name, commits=commitSummary))
        fh.write('\n')

with open(pathToProjectsHtml, 'a') as fh:
    fh.write(template.render(projects=items))
    fh.write('\n')
