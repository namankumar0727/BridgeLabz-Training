package com.smarthomeautomationsystem;

public class Fan extends Appliance {

    Fan(int powerConsumption) {
        super(powerConsumption);
    }

    @Override
    public void turnOn() {
        setPowerState(true);
        System.out.println("Fan turned ON (Cooling mode).");
    }

    @Override
    public void turnOff() {
        setPowerState(false);
        System.out.println("Fan turned OFF.");
    }
}
