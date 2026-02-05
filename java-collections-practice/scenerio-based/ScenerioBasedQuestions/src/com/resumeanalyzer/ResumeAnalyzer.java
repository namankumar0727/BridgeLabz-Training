package com.resumeanalyzer;

import java.io.File;
import java.util.*;
import java.util.regex.Matcher;

public class ResumeAnalyzer {

    public static void main(String[] args) {

        File folder = new File("resumes");

        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> sortedList = new ArrayList<>();

        for (File file : Objects.requireNonNull(folder.listFiles())) {

            try {
                String content = ResumeReader.readResume(file);

                // Extract Email
                Matcher emailMatcher =
                        ResumeRegexUtil.EMAIL_PATTERN.matcher(content);
                if (!emailMatcher.find()) {
                    throw new Exception("Email not found");
                }
                String email = emailMatcher.group();

                // Extract Phone
                Matcher phoneMatcher =
                        ResumeRegexUtil.PHONE_PATTERN.matcher(content);
                String phone = phoneMatcher.find()
                        ? phoneMatcher.group()
                        : "N/A";

                // Count Keywords
                Matcher keywordMatcher =
                        ResumeRegexUtil.KEYWORD_PATTERN.matcher(content);
                int keywordCount = 0;
                while (keywordMatcher.find()) {
                    keywordCount++;
                }

                ResumeData data =
                        new ResumeData(email, phone, keywordCount, file.getName());

                resumeMap.put(email, data);
                sortedList.add(data);

            } catch (Exception e) {
                System.out.println("Skipping file: " +
                        file.getName() + " | Reason: " + e.getMessage());
            }
        }

        // Sort by keyword count (Descending)
        sortedList.sort(
                Comparator.comparingInt(ResumeData::getKeywordCount).reversed()
        );

        System.out.println("\n📌 Sorted Candidates:");
        sortedList.forEach(System.out::println);
    }
}
