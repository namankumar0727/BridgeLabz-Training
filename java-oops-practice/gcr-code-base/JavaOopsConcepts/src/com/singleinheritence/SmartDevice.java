package com.singleinheritence;

public class SmartDevice{
    public static void main(String[] args) {
    	
        Thermostat t1 = new Thermostat("TH-101", true, 24);
        Thermostat t2 = new Thermostat("TH-102", false, 18);

        t1.displayStatus();
        System.out.println();

        t2.displayStatus();
    }
}
