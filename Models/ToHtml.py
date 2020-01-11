import RW
from jinja2 import Environment, FileSystemLoader
import os





fileDir = os.path.dirname(os.path.realpath('__file__'))
pathToProjectsHtml = os.path.join(fileDir, "../../docs/projects.html")


env = Environment(loader=FileSystemLoader(fileDir))
template = env.get_template("ProjectTemplate.html")
commmitTemplate = env.get_template("CommitTemplate.html")


projects = RW.readProject('projects')
items = []
for p in projects:
    commits = RW.readCommit('commits_' + p.name)
    l = str(len(commits))
    d = dict(name = p.name, Url = p.url, totalCommits=p.totalCommits, CommitsAnalyzed = l)
    items.append(d)
    cmts = []
    for cmt in commits:
        r = str(sum(list(map(lambda r: r.occurences, cmt.refactorings))))
        c = dict(sha = cmt.sha, filesAdded = cmt.fileDiff.filesAdded,
                 filesRenamed = cmt.fileDiff.filesRenamed,
                 filesModified = cmt.fileDiff.filesModified,
                 filesRemoved = cmt.fileDiff.filesRemoved,
                 noOfJars = str(len(cmt.dependencies)),
                 refactoringsLink = cmt.sha + ".html",
                 noOfRefactoring = r)
        cmts.append(c)
        # for ref in cmt.refactorings:






    pathToProjectCommits =  os.path.join(fileDir, "../../docs/" + p.name +".html")
    with open(pathToProjectCommits, 'a') as fh:
        fh.write(commmitTemplate.render(projectName = p.name, commits=cmts))
        fh.write('\n')





with open(pathToProjectsHtml, 'a') as fh:
    fh.write(template.render(projects=items))
    fh.write('\n')


