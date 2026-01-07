package com.inheritence.levelone;

public class Truck extends Vehicle {
	
	//Declaring the variable 
    double loadCapacity;

    //Constructors
    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
