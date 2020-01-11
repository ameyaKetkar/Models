from CommitInfo_pb2 import CommitInfo
import Project_pb2 as p
import os
from google.protobuf.internal.decoder import _DecodeVarint32

def readFile(filename):
    filehandle = open(filename)
    s = filehandle.read()
    filehandle.close()
    return s

def readProject(fileName):
    fileDir = os.path.dirname(os.path.realpath('__file__'))
    sizes = list(map(lambda s: int(s),filter(lambda s: s is not '', readFile(os.path.join(fileDir, '../../Output/ProtosOut/' + fileName + 'BinSize.txt')).split(" "))))
    print(sizes)
    buf = os.path.join(fileDir, '../../Output/ProtosOut/' + fileName + '.txt')
    l = []
    with open(buf, 'rb') as f:
        buf = f.read()
        n = 0
        for s in sizes:
            msg_buf = buf[n:n+s]
            n += s
            prj = p.Project()
            prj.ParseFromString(msg_buf)
            l.append(prj)
    return l


def readCommit(fileName):
    fileDir = os.path.dirname(os.path.realpath('__file__'))
    sizes = list(map(lambda s: int(s),filter(lambda s: s is not '', readFile(os.path.join(fileDir, '../../Output/ProtosOut/' + fileName + 'BinSize.txt')).split(" "))))
    buf = os.path.join(fileDir, '../../Output/ProtosOut/' + fileName + '.txt')
    l = []
    with open(buf, 'rb') as f:
        buf = f.read()
        n = 0
        for s in sizes:
            msg_buf = buf[n:n+s]
            n += s
            c = CommitInfo()
            c.ParseFromString(msg_buf)
            l.append(c)
    return l




