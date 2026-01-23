package com.gamerzone;
import java.util.Scanner;

public class GamerZoneApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Player " + (i + 1));

            System.out.print("Player Name: ");
            String name = sc.nextLine();

            System.out.print("Score: ");
            int score = sc.nextInt();
            sc.nextLine();

            players[i] = new Player(name, score);
        }

        // Quick Sort players by score
        QuickSortPlayers.quickSort(players, 0, n - 1);

        System.out.println("\n🏆 GamerZone Leaderboard:");
        int rank = 1;
        for (Player player : players) {
            System.out.println("Rank " + rank++ + " → " + player);
        }

        sc.close();
    }
}
