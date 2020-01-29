package com.t2r.common.utilities;

import com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph;
import com.t2r.common.models.ast.TypeNodeOuterClass;
import com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.TypeKind;
import com.t2r.common.models.refactorings.CodeStatisticsOuterClass.CodeStatistics;
import com.t2r.common.models.refactorings.CommitInfoOuterClass.CommitInfo;
import com.t2r.common.models.refactorings.ElementKindOuterClass.ElementKind;
import com.t2r.common.models.refactorings.NameSpaceOuterClass.NameSpace;
import com.t2r.common.models.refactorings.TypeChangeAnalysisOuterClass.TypeChangeAnalysis;
import io.vavr.Tuple;

import java.util.List;
import java.util.Map;

import static com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.TypeKind.Primitive;
import static com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.TypeKind.Simple;
import static java.util.stream.Collectors.*;

public class PrettyPrinter {


    public static String pretty(TypeGraph tg) {
        if (tg.getRoot().getKind().equals(Simple) || tg.getRoot().getKind().equals(Primitive)) {
            return tg.getRoot().getName();
        } else if (tg.getRoot().getKind().equals(TypeKind.Parameterized)) {
            return pretty(tg.getEdgesMap().get("of")) + "<"
                    + tg.getEdgesMap().entrySet().stream().filter(x -> x.getKey().contains("Param"))
                    .map(x -> pretty(x.getValue())).collect(joining(", ")) + ">";
        } else if (tg.getRoot().getKind().equals(TypeKind.Array)) {
            return pretty(tg.getEdgesMap().get("of")) + "[]";
        } else if (tg.getRoot().getKind().equals(TypeKind.WildCard)) {
            if (tg.getEdgesMap().containsKey("extends")) {
                return "? extends " + pretty(tg.getEdgesMap().get("extends"));
            }
            if (tg.getEdgesMap().containsKey("super"))
                return "? super " + pretty(tg.getEdgesMap().get("super"));
            else return "?";
        } else if (tg.getRoot().getKind().equals(TypeKind.Union))
            return tg.getEdgesMap().entrySet().stream().filter(x -> x.getKey().contains("Union") || x.getKey().contains("Intersection"))
                    .map(x -> pretty(x.getValue()))
                    .collect(joining(" & "));
        return "";
    }

    public static String pretty(TypeNodeOuterClass.TypeNode tg) {
        if (tg.getKind().equals(Simple) || tg.getKind().equals(Primitive)) {
            return tg.getName();
        }
        return "";
    }


    public static String prettySyntacticUpdate(TypeChangeAnalysis.SyntacticTransformation t) {
        return (pretty(t.getB4()) + "   " + pretty(t.getAftr()))
                + "\n"
                + String.join("\t", t.getTransformationList())
                + "\n"
                + t.getSubTransformationsList().stream().map(PrettyPrinter::prettySyntacticUpdate).collect(joining("\n"));

    }


    public static String prettyCommit(CommitInfo c, List<TypeChangeAnalysis> tca, CodeStatistics cs) {

        return String.join("\n", "===========================" + c.getSha() + "=========================="
                , prettyDepUpdate(c)
                , prettyFileStats(c)
                , tca.stream().map(x -> prettyTypeChangeAnalysis(x)).collect(joining("\n"))
                , prettyCodeStats(cs)
                , getStatsForAllTypeChange(tca)
                , "==============");
    }

    public static String prettyFileStats(CommitInfo c) {
        return String.join("\n", "--------File Stats-------"
                , "Added : " + c.getFileDiff().getFilesAdded()
                , "Removed : " + c.getFileDiff().getFilesRemoved()
                , "Renamed : " + c.getFileDiff().getFilesRenamed()
                , "Modified : " + c.getFileDiff().getFilesModified());
    }


    public static String prettyJar(CommitInfo.JarInfo ji) {
        return String.join(",", ji.getArtifactID(), ji.getGroupID(), ji.getVersion());
    }

    public static String prettyDepUpdate(CommitInfo c) {
        if (!c.hasDependencyUpdate())
            return "";
        return String.join("\n", "----Dependencies----"
                , c.getDependencyUpdate().getRemovedList().stream().map(x -> prettyJar(x)).collect(joining(","))
                , c.getDependencyUpdate().getAddedList().stream().map(x -> prettyJar(x)).collect(joining(","))
                , c.getDependencyUpdate().getUpdateList().stream().map(x -> prettyJar(x.getBefore()) + " -> " + prettyJar(x.getAfter())).collect(joining(","))
                , "---------Dependencies-------");
    }

    public static String prettyTypeChangeAnalysis(TypeChangeAnalysis tca) {
        return "-----" + "\n" +
                pretty(tca.getB4()) + " to " + pretty(tca.getAftr()) + "\n"
                + "\t" + tca.getNameSpacesB4().name() + " " + tca.getNameSpaceAfter().name() + "\n"
                + "\t" + tca.getTypeSemb4().name() + " " + tca.getTypeSemAftr().name() + "\n"
                + (tca.getHierarchyRelation().isEmpty() ? "" : "\t" + tca.getHierarchyRelation() + "\n")
                + (tca.getB4ComposesAfter() ? "Composition" : "")
                + prettyPrimitiveInfo(tca) + "\n"
                + "\t" + tca.getTypeChangeInstancesCount() + "\n"
                + "\t Matched Statements : " + tca.getTypeChangeInstancesList().stream().mapToLong(x -> x.getCodeMappingCount()).sum() +  "\n"
                + "\t Unmatched Statements : " + tca.getTypeChangeInstancesList().stream()
                        .mapToLong(x -> x.getCodeMappingList().stream().filter(z -> z.getIsSame()).count()).sum() +  "\n"
                + "\t \t" + tca.getTypeChangeInstancesList().stream().flatMap(x -> x.getCodeMappingList().stream())
                                    .map(x -> x.getB4() + "\n \t \t \t " + x.getAfter()).collect(joining("\n"))
                + "\n" + "-----";

    }

//    public static String prettyTypeChangeInstance(TypeChangeAnalysis tca) {
//
//        List<TypeChangeInstance> ti = tca.getTypeChangeInstancesList();
//
//        return String.join("\n"
//                , "TypeKind : " + ti.stream().collect(groupingBy(x -> x.getB4().getRoot().getKind(), counting())).toString()
//                , "Visibility : " + ti.stream().collect(groupingBy(x -> x.getVisibility(), counting())).toString()
//                , "Element Kind : " + ti.stream().collect(groupingBy(x -> x.getElementKindAffected(), counting())).toString());
//
//    }

    public static String prettyPrimitiveInfo(TypeChangeAnalysis tca) {
        if (!tca.hasPrimitiveInfo())
            return "";
        var pa = tca.getPrimitiveInfo();
        return "\t" + (pa.getBoxing() ? "Boxed\n" : "")
                + (pa.getUnboxing() ? "Unboxed\n" : "")
                + (pa.getWidening() ? "Widened\n" : "")
                + (pa.getNarrowing() ? "Narrowed\n" : "");

    }


    public static String prettyCodeStats(CodeStatistics cs) {
        Map<String, Long> visibilityMap = cs.getElementsList().stream().map(x -> x.getVisibility()).collect(groupingBy(x -> x, counting()));
        Map<NameSpace, Long> namespaceMap = cs.getNamespacesList().stream().collect(groupingBy(x -> x, counting()));
        Map<ElementKind, Long> elemKindMap = cs.getElementsList().stream().map(x -> x.getElemKind()).collect(groupingBy(x -> x, counting()));
        Map<TypeKind, Long> typeKindMap = cs.getElementsList().stream().map(x -> x.getType().getRoot().getKind()).collect(groupingBy(x -> x, counting()));
        return "-------Code Statistics--------" + "\n" +
                "Visibility : " + visibilityMap.toString() + "\n" +
                "Namespace : " + namespaceMap.toString() + "\n" +
                "Element Kind : " + elemKindMap.toString() + "\n" +
                "Type Kind : " + typeKindMap.toString();
    }

    public static String getStatsForAllTypeChange(List<TypeChangeAnalysis> tcs){

        Map<String, Long> visibilityMap = tcs.stream().flatMap(x -> x.getTypeChangeInstancesList().stream())
                .collect(groupingBy(x -> x.getVisibility(), counting()));
        Map<ElementKind, Long> elemKindMap = tcs.stream().flatMap(x -> x.getTypeChangeInstancesList().stream())
                .collect(groupingBy(x -> x.getElementKindAffected(), counting()));
        Map<TypeKind, Long> typeKindMap =  tcs.stream().flatMap(x -> x.getTypeChangeInstancesList().stream())
                .collect(groupingBy(x -> x.getB4().getRoot().getKind(), counting()));
        Map<NameSpace, Integer> namespaceMap = tcs.stream().map(x -> Tuple.of(x.getNameSpacesB4(), x.getTypeChangeInstancesCount()))
                .collect(groupingBy(x -> x._1(),summingInt(x -> x._2())));
        return String.join("\n",
                "-------Type Change Statistics--------" ,
                "Number of Type Changes : " + tcs.size() ,
                "Number of Type Change Instances : " + tcs.stream().flatMap(x -> x.getTypeChangeInstancesList().stream()).count() ,
                "Visibility : " + visibilityMap.toString() ,
                "Namespace : " + namespaceMap.toString() ,
                "Element Kind : " + elemKindMap.toString() ,
                "Type Kind : " + typeKindMap.toString());

    }





}
