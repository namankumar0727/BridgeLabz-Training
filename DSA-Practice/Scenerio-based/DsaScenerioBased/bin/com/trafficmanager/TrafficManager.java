package com.trafficmanager;
import java.util.Scanner;

public class TrafficManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(5);

        while (true) {
            System.out.println("\n--- Traffic Manager ---");
            System.out.println("1. Add vehicle to queue");
            System.out.println("2. Move vehicle to roundabout");
            System.out.println("3. Remove vehicle from roundabout");
            System.out.println("4. Display roundabout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    queue.enqueue(sc.nextLine());
                    break;

                case 2:
                    String v = queue.dequeue();
                    if (v != null)
                        roundabout.addVehicle(v);
                    break;

                case 3:
                    System.out.print("Enter vehicle number to remove: ");
                    roundabout.removeVehicle(sc.nextLine());
                    break;

                case 4:
                    roundabout.printRoundabout();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
