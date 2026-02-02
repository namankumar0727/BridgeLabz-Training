package com.all_interfaces.simpleinterface.smartdevicecontrol;

public class AirConditioner implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF");
    }
}
