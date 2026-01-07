package com.ridehailingappinmaking;

public class Sedan extends Vehicle {

    Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan");
    }

    @Override
    double getRatePerKm() {
        return 15;
    }
}

