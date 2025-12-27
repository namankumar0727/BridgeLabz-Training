package com.constructor.levelone;

public class CarRental {

	    String customerName;
	    String carModel;
	    int rentalDays;
	    double costPerDay;

	    // Default Constructor
	    public CarRental() {
	        customerName = "Customer";
	        carModel = "Hatchback";
	        rentalDays = 1;
	        costPerDay = 1000.0;
	    }

	    // Parameterized Constructor
	    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
	        this.customerName = customerName;
	        this.carModel = carModel;
	        this.rentalDays = rentalDays;
	        this.costPerDay = costPerDay;
	    }

	    // Method to calculate total cost
	    public double calculateTotalCost() {
	        return rentalDays * costPerDay;
	    }

	    // Method to display rental details
	    public void displayDetails() {
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Car Model     : " + carModel);
	        System.out.println("Rental Days   : " + rentalDays);
	        System.out.println("Total Cost    : ₹" + calculateTotalCost());
	        System.out.println("----------------------------");
	    }

}
