package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru<T> {

    // Regex to extract ratings like 7/10, 9/10
    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d{1,2})/10");

    // Map<Category, List<Feedback>>
    private Map<FeedbackCategory, List<T>> feedbackMap = new HashMap<>();

    public FeedbackGuru() {
        for (FeedbackCategory category : FeedbackCategory.values()) {
            feedbackMap.put(category, new ArrayList<>());
        }
    }

    public void analyzeFeedback(File folder) {

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Feedback folder not found");
            return;
        }

        for (File file : folder.listFiles()) {

            if (!file.getName().endsWith(".txt")) continue;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;
                while ((line = br.readLine()) != null) {
                    processLine(line);
                }

            } catch (Exception e) {
                System.out.println("Skipping file: " + file.getName());
            }
        }
    }

    private void processLine(String line) {

        try {
            Matcher matcher = RATING_PATTERN.matcher(line);

            if (!matcher.find()) {
                throw new IllegalArgumentException("Rating missing");
            }

            int rating = Integer.parseInt(matcher.group(1));

            FeedbackCategory category = categorize(rating);

            feedbackMap.get(category).add((T) line);

        } catch (Exception e) {
            System.out.println("Skipping invalid feedback: " + line);
        }
    }

    private FeedbackCategory categorize(int rating) {

        if (rating >= 8) {
            return FeedbackCategory.POSITIVE;
        } else if (rating >= 5) {
            return FeedbackCategory.NEUTRAL;
        } else {
            return FeedbackCategory.NEGATIVE;
        }
    }

    public void printSummary() {

        System.out.println("\n Feedback Summary:");

        for (Map.Entry<FeedbackCategory, List<T>> entry : feedbackMap.entrySet()) {
            System.out.println(
                    entry.getKey() + " → " + entry.getValue().size() + " feedback(s)"
            );
        }
    }

    public static void main(String[] args) {

        FeedbackGuru<String> guru = new FeedbackGuru<>();

        File folder = new File("feedback");
        guru.analyzeFeedback(folder);
        guru.printSummary();
    }
}
