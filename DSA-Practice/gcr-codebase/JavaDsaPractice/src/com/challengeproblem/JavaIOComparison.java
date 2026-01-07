package com.challengeproblem;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class JavaIOComparison {

    // ---------- STRING BUILDER VS STRING BUFFER ----------
    private static void compareStringConcatenation() {

        int iterations = 1_000_000;
        String text = "hello";

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();

        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("---- String Concatenation Performance ----");
        System.out.println("StringBuilder Time : " + builderTime + " ns");
        System.out.println("StringBuffer Time  : " + bufferTime + " ns");

        System.out.println(builderTime < bufferTime
                ? "StringBuilder is faster.\n"
                : "StringBuffer is faster.\n");
    }

    // ---------- FILE READER WORD COUNT ----------
    private static void countWordsUsingFileReader(String filePath) {

        long start = System.nanoTime();
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        long end = System.nanoTime();

        System.out.println("---- FileReader Result ----");
        System.out.println("Words Counted : " + wordCount);
        System.out.println("Time Taken    : " + (end - start) + " ns\n");
    }

    // ---------- INPUT STREAM READER WORD COUNT ----------
    private static void countWordsUsingInputStreamReader(String filePath) {

        long start = System.nanoTime();
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }

        long end = System.nanoTime();

        System.out.println("---- InputStreamReader Result ----");
        System.out.println("Words Counted : " + wordCount);
        System.out.println("Time Taken    : " + (end - start) + " ns\n");
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {

        String largeFilePath = "largefile.txt"; // replace with 100MB file path

        compareStringConcatenation();

        countWordsUsingFileReader(largeFilePath);

        countWordsUsingInputStreamReader(largeFilePath);
    }
}
