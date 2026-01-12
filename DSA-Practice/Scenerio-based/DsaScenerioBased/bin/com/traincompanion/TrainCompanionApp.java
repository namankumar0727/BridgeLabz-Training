package com.traincompanion;
import java.util.Scanner;

public class TrainCompanionApp {

    public static void main(String[] args) {
    	
    		//Take inputs from the user
        Scanner sc = new Scanner(System.in);
        TrainCompanionManager manager = new TrainCompanionManager();

        while (true) {
            System.out.println("\n--- Train Companion Menu ---");
            System.out.println("1. Add Compartment");
            System.out.println("2. Remove Compartment");
            System.out.println("3. Move Forward");
            System.out.println("4. Move Backward");
            System.out.println("5. Search Service");
            System.out.println("6. Show Current Compartment");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter compartment name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter service: ");
                    String service = sc.nextLine();
                    manager.addCompartment(name, service);
                    break;

                case 2:
                    System.out.print("Enter compartment name to remove: ");
                    manager.removeCompartment(sc.nextLine());
                    break;

                case 3:
                    manager.moveForward();
                    break;

                case 4:
                    manager.moveBackward();
                    break;

                case 5:
                    System.out.print("Enter service to search: ");
                    manager.searchService(sc.nextLine());
                    break;

                case 6:
                    manager.showCurrent();
                    break;

                case 7:
                    System.out.println("Thank you for using TrainCompanion!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
