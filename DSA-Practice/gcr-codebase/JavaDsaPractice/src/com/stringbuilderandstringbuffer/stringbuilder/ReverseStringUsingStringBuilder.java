package com.stringbuilderandstringbuffer.stringbuilder;
import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

    	//Taking input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create StringBuilder and append string
        StringBuilder sb = new StringBuilder();
        sb.append(input);

        // Reverse the string
        sb.reverse();

        // Convert back to String
        String reversedString = sb.toString();

        System.out.println("Reversed String: " + reversedString);

        sc.close();
    }
}
