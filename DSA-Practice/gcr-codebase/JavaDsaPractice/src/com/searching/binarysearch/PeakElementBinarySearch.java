package com.searching.binarysearch;
import java.util.Scanner;

public class PeakElementBinarySearch {

    // Method to find any peak element using binary search
    public static int findPeakElement(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check left and right neighbors safely
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOK = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            // If both conditions are satisfied, it's a peak
            if (leftOK && rightOK) {
                return mid;
            }

            // If left neighbor is greater, move left
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Else move right
            else {
                left = mid + 1;
            }
        }

        return -1; // should never reach here for valid input
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeakElement(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        sc.close();
    }
}
