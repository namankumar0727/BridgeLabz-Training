package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    public static void main(String[] args) throws IOException {

        Path sourceRoot = Paths.get("sourceRepo");
        Path outputRoot = Paths.get("output");

        // Create output folders
        for (FileType type : FileType.values()) {
            Files.createDirectories(outputRoot.resolve(type.name()));
        }

        // Scan all .java files (recursive)
        List<Path> javaFiles = Files.walk(sourceRoot)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        Map<FileType, List<File>> categorizedFiles = new HashMap<>();
        Set<String> uniqueFileNames = new HashSet<>();

        for (FileType type : FileType.values()) {
            categorizedFiles.put(type, new ArrayList<>());
        }

        for (Path path : javaFiles) {

            String content = Files.readString(path);
            FileType type = JavaFileAnalyzer.analyze(content);

            File file = path.toFile();
            categorizedFiles.get(type).add(file);
            uniqueFileNames.add(file.getName());

            // Copy file to output folder
            Files.copy(
                    path,
                    outputRoot.resolve(type.name()).resolve(path.getFileName()),
                    StandardCopyOption.REPLACE_EXISTING
            );
        }

        // Stream filtering example (files > 5KB)
        System.out.println("\n Large Java Files (>5KB):");
        javaFiles.stream()
                .filter(p -> p.toFile().length() > 5 * 1024)
                .forEach(p -> System.out.println(p.getFileName()));

        // Summary
        System.out.println("\n Summary:");
        categorizedFiles.forEach((k, v) ->
                System.out.println(k + " → " + v.size() + " files"));

        System.out.println("\n📌 Unique Java file names count: " + uniqueFileNames.size());
    }
}
