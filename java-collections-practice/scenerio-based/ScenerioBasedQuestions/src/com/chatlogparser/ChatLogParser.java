package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    // [12:02 PM] John: Hey, the build failed again!
    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

    public static void main(String[] args) {

        File file = new File("answers/team_chat.txt");

        // TreeMap for alphabetical sorting of users
        Map<String, List<String>> userMessages = new TreeMap<>();

        MessageFilter<String> filter = new IdleChatFilter();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                try {
                    Matcher matcher = CHAT_PATTERN.matcher(line);

                    if (!matcher.matches()) {
                        throw new IllegalArgumentException("Invalid format");
                    }

                    String time = matcher.group(1);
                    String user = matcher.group(2);
                    String message = matcher.group(3);

                    // Apply idle chat filter
                    if (!filter.allow(message)) {
                        continue;
                    }

                    userMessages
                            .computeIfAbsent(user, k -> new ArrayList<>())
                            .add("[" + time + "] " + message);

                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output result
        System.out.println("\nParsed Chat Messages:");
        userMessages.forEach((user, messages) -> {
            System.out.println("\n " + user);
            messages.forEach(msg -> System.out.println("  " + msg));
        });
    }
}
