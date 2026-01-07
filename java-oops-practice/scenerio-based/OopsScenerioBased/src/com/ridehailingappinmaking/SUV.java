package com.ridehailingappinmaking;

public class SUV extends Vehicle {

    SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV");
    }

    @Override
    double getRatePerKm() {
        return 20;
    }
}
