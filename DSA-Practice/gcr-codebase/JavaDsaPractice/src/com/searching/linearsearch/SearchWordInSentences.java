package com.searching.linearsearch;
import java.util.Scanner;

public class SearchWordInSentences {

    // Method to search for a word using linear search
    public static String searchSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence; // first sentence containing the word
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];

        System.out.println("Enter sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        String result = searchSentence(sentences, word);

        System.out.println("Result: " + result);

        sc.close();
    }
}
