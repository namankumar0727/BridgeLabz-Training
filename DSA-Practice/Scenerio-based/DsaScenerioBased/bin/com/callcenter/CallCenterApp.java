package com.callcenter;
import java.util.Scanner;

public class CallCenterApp {

    public static void main(String[] args) {
    	
    		//Taking input from the user
        Scanner scanner = new Scanner(System.in);
        CallCenterQueueManager manager = new CallCenterQueueManager();
        
        while (true) {
            System.out.println("\n----- Call Center Menu -----");
            System.out.println("1. Add Incoming Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. Display Call Count");
            System.out.println("4. Exit");
            System.out.print("Choose an option - ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Is VIP customer? (true/false): ");
                    boolean isVIP = scanner.nextBoolean();

                    Customer customer = new Customer(id, name, isVIP);
                    manager.addCall(customer);
                    break;

                case 2:
                    manager.handleNextCall();
                    break;

                case 3:
                    manager.displayCallCounts();
                    break;

                case 4:
                    System.out.println("Exiting Call Center System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
