package com.t2r.common.utilities;

import static java.util.stream.Collectors.toList;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;

import io.vavr.CheckedConsumer;
import io.vavr.control.Try;

public class FileUtils {


    public static Path createIfAbsent(Path p){
        return Try.of(() -> p.toFile().exists() ? p : Files.createFile(p))
                .getOrElseThrow(() -> new RuntimeException("Could Not create file " + p.toString()));
    }

    public static void appendToFile(Path p, CheckedConsumer<FileOutputStream> content){
        Try.of(() -> {
            FileOutputStream output = new FileOutputStream(p.toString(), true);
            content.accept(output);
            output.close();
            return true;
        }).getOrElseThrow(() -> new RuntimeException("Could not append to file"));

    }

    public static void writeToFile(Path p, CheckedConsumer<FileOutputStream> content){
        Try.of(() -> {
            FileOutputStream output = new FileOutputStream(p.toString(), false);
            content.accept(output);
            output.close();
            return true;
        }).getOrElseThrow(() -> new RuntimeException("Could not append to file"));

    }


    public static <T> List<T> parseCsv(String path, Function<String[], T> parser){
        try {
            return Files.readAllLines(Paths.get(path)).stream()
                    .map(e -> e.split(","))
                    .map(parser)
                    .collect(toList());
        }catch (Exception e){
            System.out.println("Could not the csv file " + path );
            throw new RuntimeException("Could not read projects");
        }
    }

}
