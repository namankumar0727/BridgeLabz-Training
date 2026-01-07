package com.challengeproblem;
import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinarySearchChallenge {

    // ---------- PART 1: LINEAR SEARCH ----------
    // Find first missing positive integer
    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        // Mark positive numbers as visited
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        // Find first unvisited positive number
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    // ---------- PART 2: BINARY SEARCH ----------
    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear Search result
        int missing = firstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        // Binary Search
        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();

        Arrays.sort(arr);
        int index = binarySearch(arr, target);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Target index (Binary Search): " + index);

        sc.close();
    }
}
