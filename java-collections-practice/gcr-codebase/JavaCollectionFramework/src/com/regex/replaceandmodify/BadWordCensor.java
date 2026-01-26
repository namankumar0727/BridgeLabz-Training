package com.regex.replaceandmodify;
public class BadWordCensor {

    public static void main(String[] args) {

        String input = "This is a damn bad example with some stupid words.";

        // List of bad words
        String badWordsRegex = "\\b(damn|stupid)\\b";

        // Replace bad words with ****
        String censored = input.replaceAll("(?i)" + badWordsRegex, "****");

        System.out.println(censored);
    }
}
