package com.parkease;
public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50); // base rate per hour
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 5;
        double penalty = hours > allowedHours ? (hours - allowedHours) * 20 : 0;
        return (baseRate * hours) + penalty;
    }
}
