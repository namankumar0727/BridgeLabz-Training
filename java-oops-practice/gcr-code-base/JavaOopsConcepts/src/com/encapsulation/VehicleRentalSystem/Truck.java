package com.encapsulation.VehicleRentalSystem;

public class Truck extends Vehicle {

    Truck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Truck", rentalRate, policyNo);
    }

    @Override
    double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000; // loading charge
    }

    @Override
    public double calculateInsurance() {
        return 5000;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance: ₹5000 per year");
    }
}
