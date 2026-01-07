package com.vehiclerentalapplication;

class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand, 500);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }
}
