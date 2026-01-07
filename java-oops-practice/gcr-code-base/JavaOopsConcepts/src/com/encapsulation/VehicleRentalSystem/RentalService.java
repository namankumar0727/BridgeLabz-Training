package com.encapsulation.VehicleRentalSystem;

import java.util.List;

public class RentalService {

    static void processRentals(List<Vehicle> vehicles, int days) {
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Rental Days is about - " + days);
            System.out.println("Rental Cost is about -  ₹" + v.calculateRentalCost(days));
            v.getInsuranceDetails();
            System.out.println("Insurance Cost is about - " + v.calculateInsurance());
            System.out.println("----------------------------------");
        }
    }
}
