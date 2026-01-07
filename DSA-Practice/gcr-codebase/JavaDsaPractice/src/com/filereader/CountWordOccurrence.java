package com.filereader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordOccurrence {

    public static void main(String[] args) {

    	//Taking inputs from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        System.out.print("Enter word to search: ");
        String targetWord = sc.nextLine();

        int count = 0;

        try {
            // Create FileReader
            FileReader fileReader = new FileReader(filePath);

            // Wrap with BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            bufferedReader.close();

            // Print result
            System.out.println("\nThe word \"" + targetWord +
                    "\" occurred " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
