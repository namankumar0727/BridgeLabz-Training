package com.vehiclerentalapplication;

abstract class Vehicle implements Rentable {

	//Declaration
    protected String vehicleNumber;
    protected String brand;
    protected double baseRate; // per day

    //Constructor
    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Encapsulation via getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    void displayInfo() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Base Rate per day: ₹" + baseRate);
    }
}
