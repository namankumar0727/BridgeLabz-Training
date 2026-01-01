package com.encapsulation.VehicleRentalSystem;

public abstract class Vehicle implements Insurable {

    private String vehicleNumber;
    private String type;
    private double rentalRate;        
    private String insurancePolicyNo;

    //Constructor
    Vehicle(String vehicleNumber, String type,
            double rentalRate, String insurancePolicyNo) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNo = insurancePolicyNo;
    }

    // Encapsulation using getters (no setter for policy number)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected double getRentalRate() {
        return rentalRate;
    }

    // Concrete method
    void getVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rental Rate (per day): ₹" + rentalRate);
    }

    // Abstract method
    abstract double calculateRentalCost(int days);
}
