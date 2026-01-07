package com.ridehailingappinmaking;

public class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private boolean rideActive;

    private final double baseFare = 50;

    RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.rideActive = false;
    }

    @Override
    public void bookRide(double distance) {
        double totalFare = baseFare + (distance * vehicle.getRatePerKm());
        vehicle.setFare(totalFare);
        rideActive = true;

        System.out.println("\nRide Booked Successfully!");
        vehicle.displayVehicle();
        driver.displayDriver();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + vehicle.getFare());
    }

    @Override
    public void endRide() {
        if (rideActive) {
            rideActive = false;
            System.out.println("\nRide Ended.");
            System.out.println("Final Fare: ₹" + vehicle.getFare());
        } else {
            System.out.println("No active ride.");
        }
    }
}

