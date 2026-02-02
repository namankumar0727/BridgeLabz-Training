package com.all_interfaces.defaultmethodsinterface.smartvehicle;

public class PetrolCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}
