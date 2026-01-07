package com.stringbuilderandstringbuffer.stringbuffer;
import java.util.Scanner;

public class ConcatenateStringsUsingStringBuffer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        // Input strings
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Create StringBuffer
        StringBuffer sb = new StringBuffer();

        // Append each string
        for (String str : arr) {
            sb.append(str);
        }

        // Convert to String
        String result = sb.toString();

        System.out.println("\nConcatenated String: " + result);

        sc.close();
    }
}
