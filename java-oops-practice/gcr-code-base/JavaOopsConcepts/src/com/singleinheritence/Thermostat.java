package com.singleinheritence;

public class Thermostat extends Device {
	
	//Declaring the variables
    int temperatureSetting;

    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
