package com.vehiclerentalapplication;

public class Car extends Vehicle {

    Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand, 1500);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 1000; // service charge
    }
}
