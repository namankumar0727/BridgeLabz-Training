package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner<T extends AnswerSheet> {

    // Valid options: A, B, C, D
    private static final Pattern LINE_PATTERN =
            Pattern.compile("^([A-Za-z ]+)(,(A|B|C|D))+$");

    public Map<String, Integer> scan(File file,
                                     List<String> answerKey) {

        Map<String, Integer> scoreMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                try {
                    validateLine(line);

                    String[] parts = line.split(",");
                    String name = parts[0];

                    List<String> answers =
                            Arrays.asList(parts).subList(1, parts.length);

                    // Generic subject handling
                    T sheet = (T) new MathAnswerSheet(name, answers);

                    int score = sheet.evaluate(answerKey);
                    scoreMap.put(name, score);

                } catch (Exception e) {
                    System.out.println(" Invalid line skipped: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return scoreMap;
    }

    private void validateLine(String line) {
        Matcher matcher = LINE_PATTERN.matcher(line);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Formatting issue");
        }
    }

    public static void main(String[] args) {

        File file = new File("answers/math_answers.csv");

        // Answer key
        List<String> answerKey =
                List.of("A", "B", "C", "D", "A", "B", "C");

        ExamScanner<MathAnswerSheet> scanner = new ExamScanner<>();
        Map<String, Integer> results = scanner.scan(file, answerKey);

        // Sort using PriorityQueue (highest score first)
        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );

        pq.addAll(results.entrySet());

        System.out.println("\n Exam Results:");
        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> e = pq.poll();
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
