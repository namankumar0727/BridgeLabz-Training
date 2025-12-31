package com.inheritence.levelone;

public class Vehicle {
	
	//Declaring the variables
    int maxSpeed;
    String fuelType;

    //Constructors
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
