package com.homenest;
class Thermostat extends Device {

    public Thermostat(String id) {
        super(id, 20);
    }

    @Override
    public void reset() {
        turnOff();
        firmwareUpdateLog("Temperature reset to default");
    }
}
