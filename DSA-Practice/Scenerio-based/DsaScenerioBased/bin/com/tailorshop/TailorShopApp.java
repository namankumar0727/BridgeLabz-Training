package com.tailorshop;
import java.util.Scanner;

public class TailorShopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Order " + (i + 1));

            System.out.print("Order ID: ");
            int id = sc.nextInt();

            System.out.print("Delivery Deadline (in days): ");
            int deadline = sc.nextInt();

            orders[i] = new Order(id, deadline);

            // Real-time insertion sort after each new order
            InsertionSortOrders.sortOrders(orders, i + 1);

            System.out.println("\n📋 Current Sorted Orders:");
            for (int j = 0; j <= i; j++) {
                System.out.println(orders[j]);
            }
        }

        sc.close();
    }
}
