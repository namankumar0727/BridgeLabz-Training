package com.ambulanceroute;
import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

 ([Naman] : added Ambulance Route)
    	//Taking the inputs from the scanner
        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();

        // Initial units
        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        while (true) {
            System.out.println("\n Ambulance Route Menu");
            System.out.println("1. Redirect Patient");
            System.out.println("2. Remove Unit (Maintenance)");
            System.out.println("3. Display Units");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    route.redirectPatient();
                    break;

                case 2:
                    System.out.print("Enter unit name: ");
                    String unit = sc.nextLine();
                    route.removeUnit(unit);
                    break;

                case 3:
                    route.displayUnits();
                    break;

                case 4:
                    System.out.println("Exiting system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
