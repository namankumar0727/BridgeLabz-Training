package com.browserbuddy;
import java.util.Scanner;

public class BrowserApp {
    public static void main(String[] args) {
    	
    		//Taking the inputs from the user
        Scanner sc = new Scanner(System.in);
        BrowserManager manager = new BrowserManager();

        while (true) {
            System.out.println("\n BrowserBuddy Menu");
            System.out.println("1. Visit Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Tab");
            System.out.println("5. Restore Tab");
            System.out.println("6. Exit");
            System.out.print("Choose option -> ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL -> ");
                    String url = sc.nextLine();
                    manager.getCurrentTab().visit(url);
                    break;

                case 2:
                    manager.getCurrentTab().back();
                    break;

                case 3:
                    manager.getCurrentTab().forward();
                    break;

                case 4:
                    manager.closeTab();
                    break;

                case 5:
                    manager.restoreTab();
                    break;

                case 6:
                    System.out.println("Exiting BrowserBuddy.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
