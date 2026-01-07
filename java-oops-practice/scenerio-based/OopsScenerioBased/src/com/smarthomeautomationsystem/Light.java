package com.smarthomeautomationsystem;

public class Light extends Appliance {

    Light() {
        super(40); 
    }

    @Override
    public void turnOn() {
        setPowerState(true);
        System.out.println("Light turned ON (Soft lighting).");
    }

    @Override
    public void turnOff() {
        setPowerState(false);
        System.out.println("Light turned OFF.");
    }
}
