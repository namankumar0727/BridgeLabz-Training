package com.constructor.levelone;

public class UseVehicle {

	    public static void main(String[] args) {

	        Vehicle v1 = new Vehicle("Naman", "Car");
	        Vehicle v2 = new Vehicle("Amit", "Bike");

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	        // Update registration fee for all vehicles
	        Vehicle.updateRegistrationFee(6500.0);

	        // Display again after update
	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();
	    }

}
