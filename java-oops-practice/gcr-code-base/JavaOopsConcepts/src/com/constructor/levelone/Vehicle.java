package com.constructor.levelone;

public class Vehicle {
	    // Instance variables (unique for each vehicle)
	    String ownerName;
	    String vehicleType;

	    // Class variable (same for all vehicles)
	    static double registrationFee = 5000.0;

	    // Parameterized Constructor
	    public Vehicle(String ownerName, String vehicleType) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    // Instance method
	    public void displayVehicleDetails() {
	        System.out.println("Owner Name        : " + ownerName);
	        System.out.println("Vehicle Type      : " + vehicleType);
	        System.out.println("Registration Fee  : ₹" + registrationFee);
	        System.out.println("------------------------------");
	    }

	    // Class (static) method
	    public static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }

}
