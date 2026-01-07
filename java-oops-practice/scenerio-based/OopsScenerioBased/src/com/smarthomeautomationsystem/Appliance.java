package com.smarthomeautomationsystem;

public abstract class Appliance implements Controllable {

    private boolean isOn;          
    protected int powerConsumption; 

    Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void setPowerState(boolean state) {
        this.isOn = state;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}

