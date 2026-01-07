package com.singleinheritence;

public class Device {
	
	//Declaring the variables
    String deviceId;
    boolean status;   

    //Constructors
    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}
