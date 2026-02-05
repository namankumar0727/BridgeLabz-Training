package com.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader<T> {

    // CSV validation: RollNo,Name,Subject,Marks
    private static final Pattern LINE_PATTERN =
            Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d{1,3}");

    public void processFile(File file, T examType) {

        Map<String, List<Integer>> subjectMarksMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                try {
                    validateLine(line);

                    String[] parts = line.split(",");

                    String rollNo = parts[0];
                    String name = parts[1];
                    String subject = parts[2];
                    int marks = Integer.parseInt(parts[3]);

                    if (marks < 0 || marks > 100) {
                        throw new InvalidFormatException("Invalid marks value");
                    }

                    ExamRecord<T> record =
                            new ExamRecord<>(rollNo, name, subject, marks, examType);

                    subjectMarksMap
                            .computeIfAbsent(subject, k -> new ArrayList<>())
                            .add(record.getMarks());

                } catch (InvalidFormatException e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        findTopScorers(subjectMarksMap);
    }

    private void validateLine(String line) throws InvalidFormatException {
        if (!LINE_PATTERN.matcher(line).matches()) {
            throw new InvalidFormatException("Invalid CSV format");
        }
    }

    // Top scorer per subject using PriorityQueue
    private void findTopScorers(Map<String, List<Integer>> subjectMarksMap) {

        System.out.println("\nTop Scorer Per Subject:");

        for (Map.Entry<String, List<Integer>> entry : subjectMarksMap.entrySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(entry.getValue());

            System.out.println(
                    entry.getKey() + " -> " + pq.peek()
            );
        }
    }

    public static void main(String[] args) {

        File file = new File("answers/exam_results.csv");

        ExamResultUploader<String> uploader =
                new ExamResultUploader<>();

        uploader.processFile(file, "Final Exam");
    }
}
