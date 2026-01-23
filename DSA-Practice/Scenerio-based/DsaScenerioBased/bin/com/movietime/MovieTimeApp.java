package com.movietime;
import java.util.Scanner;

public class MovieTimeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shows: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        ShowTime[] shows = new ShowTime[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Show " + (i + 1));

            System.out.print("Movie Name: ");
            String name = sc.nextLine();

            System.out.print("Show Time (HHMM format, e.g., 1830): ");
            int time = sc.nextInt();
            sc.nextLine(); // consume newline

            shows[i] = new ShowTime(name, time);

            // Real-time insertion sort after each entry
            InsertionSortShows.sortShows(shows, i + 1);
        }

        System.out.println("\n Sorted Show Listings:");
        for (ShowTime show : shows) {
            System.out.println(show);
        }

        sc.close();
    }
}
