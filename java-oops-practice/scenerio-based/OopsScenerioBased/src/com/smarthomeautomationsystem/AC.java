package com.smarthomeautomationsystem;

public class AC extends Appliance {

    private int temperature; 

    AC(int temperature) {
        super(1500);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        setPowerState(true);
        System.out.println("AC turned ON at " + temperature + "°C.");
    }

    @Override
    public void turnOff() {
        setPowerState(false);
        System.out.println("AC turned OFF.");
    }
}
