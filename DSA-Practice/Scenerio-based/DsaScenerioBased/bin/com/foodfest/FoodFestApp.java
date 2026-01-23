package com.foodfest;
import java.util.Scanner;

public class FoodFestApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of stalls: ");
        int n = sc.nextInt();
        sc.nextLine();

        StallFootfall[] stalls = new StallFootfall[n];

        System.out.println("\nEnter stall details (zone-wise already sorted):");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStall " + (i + 1));

            System.out.print("Stall Name: ");
            String name = sc.nextLine();

            System.out.print("Footfall Count: ");
            int count = sc.nextInt();
            sc.nextLine();

            stalls[i] = new StallFootfall(name, count);
        }

        // Merge Sort the combined dataset
        MergeSortStalls.mergeSort(stalls, 0, n - 1);

        System.out.println("\n🍽️ Master List Sorted by Footfall:");
        for (StallFootfall stall : stalls) {
            System.out.println(stall);
        }

        sc.close();
    }
}
