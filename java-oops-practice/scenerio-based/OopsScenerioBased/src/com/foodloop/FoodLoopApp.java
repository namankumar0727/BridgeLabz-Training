package com.foodloop;
import java.util.Scanner;

public class FoodLoopApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodItem pizza = new VegItem("Veg Pizza", 250, 10);
        FoodItem burger = new NonVegItem("Chicken Burger", 180, 10);
        FoodItem fries = new VegItem("French Fries", 120, 10);

        Order order = new Order();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Veg Pizza - ₹250");
            System.out.println("2. Chicken Burger - ₹180");
            System.out.println("3. French Fries - ₹120");
            System.out.println("4. Place Order");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> order.addItem(pizza);
                case 2 -> order.addItem(burger);
                case 3 -> order.addItem(fries);
                case 4 -> {
                    order.placeOrder();
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
