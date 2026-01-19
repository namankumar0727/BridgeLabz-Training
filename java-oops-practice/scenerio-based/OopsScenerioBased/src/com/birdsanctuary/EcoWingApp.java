package com.birdsanctuary;
import java.util.Scanner;

public class EcoWingApp {

    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Remove Bird by ID");
            System.out.println("4. Sanctuary Report");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("1.Eagle 2.Duck 3.Penguin 4.Kiwi");
                    int type = sc.nextInt();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    Bird bird = switch (type) {
                        case 1 -> new Eagle(id, name);
                        case 2 -> new Duck(id, name);
                        case 3 -> new Penguin(id, name);
                        case 4 -> new Kiwi(id, name);
                        default -> null;
                    };

                    if (bird != null) sanctuary.addBird(bird);
                }

                case 2 -> sanctuary.displayAllBirds();
                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    sanctuary.removeBirdById(sc.nextInt());
                }
                case 4 -> sanctuary.sanctuaryReport();
                case 5 -> {
                    System.out.println("Exiting EcoWing...");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
