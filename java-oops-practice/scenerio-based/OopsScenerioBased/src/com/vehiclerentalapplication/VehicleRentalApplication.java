package com.vehiclerentalapplication;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApplication {
    public static void main(String[] args) {

        Customer customer =
                new Customer("Naman", "C101");

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bike("Apache", "Honda"));
        vehicles.add(new Car("KTM", "Hyundai"));
        vehicles.add(new Truck("abc", "Tata"));

        RentalService.processRentals(customer, vehicles, 4);
    }
}
