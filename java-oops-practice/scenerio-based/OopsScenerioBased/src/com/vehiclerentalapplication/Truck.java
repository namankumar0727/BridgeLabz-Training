package com.vehiclerentalapplication;

public class Truck extends Vehicle {

    Truck(String vehicleNumber, String brand) {
        super(vehicleNumber, brand, 3000);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 3000; // heavy-load charge
    }
}
