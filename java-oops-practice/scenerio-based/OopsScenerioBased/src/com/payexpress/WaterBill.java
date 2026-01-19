package com.payexpress;
class WaterBill extends Bill {

    public WaterBill(double amount) {
        super("Water", amount, 20);
    }

    @Override
    public void sendReminder() {
        System.out.println("💧 Water bill due! Ensure uninterrupted supply.");
    }
}
