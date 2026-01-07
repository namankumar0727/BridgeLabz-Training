package com.encapsulation.VehicleRentalSystem;

public class Bike extends Vehicle {

    Bike(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Bike", rentalRate, policyNo);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance: ₹1500 per year");
    }
}
