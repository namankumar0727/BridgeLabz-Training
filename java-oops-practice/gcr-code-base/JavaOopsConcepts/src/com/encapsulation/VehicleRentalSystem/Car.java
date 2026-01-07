package com.encapsulation.VehicleRentalSystem;

public class Car extends Vehicle {

    Car(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Car", rentalRate, policyNo);
    }

    @Override
    double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 500; // service charge
    }

    @Override
    public double calculateInsurance() {
        return 3000;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance: ₹3000 per year");
    }
}
