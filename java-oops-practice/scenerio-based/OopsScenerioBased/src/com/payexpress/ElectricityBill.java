package com.payexpress;
class ElectricityBill extends Bill {

    public ElectricityBill(double amount) {
        super("Electricity", amount, 15);
    }

    @Override
    public void sendReminder() {
        System.out.println("⚡ Electricity bill due soon! Avoid power disconnection.");
    }
}
