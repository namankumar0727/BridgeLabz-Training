package com.homenest;
public class HomeNest {
    public static void main(String[] args) {

        Device d1 = new Light("Light-101");
        Device d2 = new Camera("Camera-201");
        Device d3 = new Thermostat("AC-301");
        Device d4 = new Lock("Lock-401");

        d1.turnOn();
        System.out.println("Energy: " + d1.calculateEnergy(3));

        d2.reset();
        d3.turnOn();
        d4.reset();
    }
}
