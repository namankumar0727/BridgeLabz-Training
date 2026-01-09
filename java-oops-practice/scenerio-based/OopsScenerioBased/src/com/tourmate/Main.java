package tourmate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	
    	//Taking the user inputs
        Scanner sc = new Scanner(System.in);

        // Trip basic details
        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter trip duration (days): ");
        int duration = sc.nextInt();

        sc.nextLine();

        System.out.print("Is this an International trip? (yes/no): ");
        String tripType = sc.nextLine();

        // Transport details
        System.out.print("Enter transport mode: ");
        String mode = sc.nextLine();

        System.out.print("Enter transport cost: ");
        double transportCost = sc.nextDouble();

        Transport transport = new Transport(mode, transportCost);

        // Hotel details
        sc.nextLine(); // consume newline
        System.out.print("Enter hotel name: ");
        String hotelName = sc.nextLine();

        System.out.print("Enter cost per night: ");
        double costPerNight = sc.nextDouble();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        Hotel hotel = new Hotel(hotelName, costPerNight, nights);

        // Activities
        System.out.print("Enter number of activities: ");
        int activityCount = sc.nextInt();

        sc.nextLine(); // consume newline
        List<Activity> activities = new ArrayList<>();

        for (int i = 1; i <= activityCount; i++) {
            System.out.print("Enter activity " + i + " name: ");
            String actName = sc.nextLine();

            System.out.print("Enter activity " + i + " cost: ");
            double actCost = sc.nextDouble();
            sc.nextLine(); // consume newline

            activities.add(new Activity(actName, actCost));
        }

        // Trip creation (Polymorphism)
        Trip trip;
        if (tripType.equalsIgnoreCase("yes")) {
            trip = new InternationalTrip(destination, duration, transport, hotel, activities);
        } else {
            trip = new DomesticTrip(destination, duration, transport, hotel, activities);
        }

        // Booking
        System.out.println("\n--- Booking Details ---");
        trip.book();
        System.out.println("Total Trip Budget: ₹" + trip.getBudget());

        // Cancel option
        System.out.print("\nDo you want to cancel the trip? (yes/no): ");
        sc.nextLine();
        String cancelChoice = sc.nextLine();

        if (cancelChoice.equalsIgnoreCase("yes")) {
            trip.cancel();
        }

        sc.close();
    }
}
