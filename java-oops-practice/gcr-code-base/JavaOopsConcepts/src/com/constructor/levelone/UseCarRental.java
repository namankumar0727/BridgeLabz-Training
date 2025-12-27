package com.constructor.levelone;

	public class UseCarRental {

	    public static void main(String[] args) {

	        // Default rental
	        CarRental r1 = new CarRental();
	        r1.displayDetails();

	        // Parameterized rental
	        CarRental r2 = new CarRental("Naman", "Sedan", 5, 1800.0);
	        r2.displayDetails();
	    }
	}

