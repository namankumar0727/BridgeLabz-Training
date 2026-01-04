package com.vehiclerentalapplication;

 import java.util.List;

 public class RentalService {

    static void processRentals(Customer customer,
                               List<Vehicle> vehicles,
                               int days) {

        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Rental Days: " + days);
        System.out.println("--------------------------------");

        for (Vehicle v : vehicles) {
            v.displayInfo();
            double rent = v.calculateRent(days);
            System.out.println("Total Rent: ₹" + rent);
            System.out.println("--------------------------------");
        }
    }
}
