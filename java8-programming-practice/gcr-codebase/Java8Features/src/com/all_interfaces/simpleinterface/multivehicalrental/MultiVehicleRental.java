package com.all_interfaces.simpleinterface.multivehicalrental;

public class MultiVehicleRental {
    public static void main(String[] args) {

        Rentable car = new Car();
        Rentable bike = new Bike();
        Rentable bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
