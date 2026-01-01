package com.encapsulation.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-POL-11"));
        vehicles.add(new Bike("BIKE202", 800, "BIKE-POL-22"));
        vehicles.add(new Truck("TRUCK303", 4000, "TRUCK-POL-33"));

        RentalService.processRentals(vehicles, 5);
    }
}
