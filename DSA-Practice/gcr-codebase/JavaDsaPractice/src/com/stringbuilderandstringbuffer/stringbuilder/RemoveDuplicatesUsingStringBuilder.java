package com.stringbuilderandstringbuffer.stringbuilder;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesUsingStringBuilder {

    public static void main(String[] args) {

    	//Taking inputs from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Iterate through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String without duplicates: " + result.toString());

        sc.close();
    }
}
