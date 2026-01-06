package com.eventease;
/* Main class to test EventEase functionality */
import java.util.Scanner;

public class EventEaseApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Organizer input
        System.out.print("Enter Organizer Name - ");
        String name = sc.nextLine();

        System.out.print("Enter Organizer Email - ");
        String email = sc.nextLine();

        User organizer = new User(name, email);

        // Event input
        System.out.print("Enter Event ID - ");
        int eventId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Event Name - ");
        String eventName = sc.nextLine();

        System.out.print("Enter Location - ");
        String location = sc.nextLine();

        System.out.print("Enter Event Date - ");
        String date = sc.nextLine();

        System.out.print("Enter Number of Attendees - ");
        int attendees = sc.nextInt();

        System.out.print("Enter Venue Cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Add Catering/Decoration? (1 = Yes, 0 = No): ");
        int choice = sc.nextInt();

        double serviceCost = 0, discount = 0;

        if (choice == 1) {
            System.out.print("Enter Service Cost: ");
            serviceCost = sc.nextDouble();

            System.out.print("Enter Discount: ");
            discount = sc.nextDouble();
        }

        System.out.println("Select Event Type:");
        System.out.println("1. Birthday Event");
        System.out.println("2. Conference Event");
        int type = sc.nextInt();

        Event event;

        if (type == 1) {
            event = new BirthdayEvent(eventId, eventName, location,
                    date, attendees, venueCost, serviceCost, discount, organizer);
        } else {
            event = new ConferenceEvent(eventId, eventName, location,
                    date, attendees, venueCost, serviceCost, discount, organizer);
        }

        // Polymorphism
        event.schedule();
        event.displayEventDetails();

        System.out.print("\nDo you want to reschedule? (1 = Yes, 0 = No): ");
        int res = sc.nextInt();
        sc.nextLine();

        if (res == 1) {
            System.out.print("Enter New Date: ");
            String newDate = sc.nextLine();
            event.reschedule(newDate);
        }

        System.out.print("Cancel Event? (1 = Yes, 0 = No): ");
        int cancel = sc.nextInt();

        if (cancel == 1) {
            event.cancel();
        }

        sc.close();
    }
}

