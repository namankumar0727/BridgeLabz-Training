package com.smarthomeautomationsystem;

public class SmartHomeAutomationSystem {
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(75);
        Appliance ac = new AC(22);

        // Polymorphism in action
        UserController.controlDevice(light);
        UserController.controlDevice(fan);
        UserController.controlDevice(ac);

        // Operator usage (energy comparison)
        UserController.compareEnergy(ac, fan);
    }
}
