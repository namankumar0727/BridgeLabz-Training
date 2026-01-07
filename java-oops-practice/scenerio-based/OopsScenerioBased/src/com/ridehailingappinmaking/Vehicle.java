package com.ridehailingappinmaking;

public abstract class Vehicle {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double fare;   // sensitive data

    Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    protected void setFare(double fare) {
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    public void displayVehicle() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
    }

    abstract double getRatePerKm();
}
