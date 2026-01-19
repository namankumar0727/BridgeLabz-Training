package com.payexpress;
class InternetBill extends Bill {

    public InternetBill(double amount) {
        super("Internet", amount, 10);
    }

    @Override
    public void sendReminder() {
        System.out.println("🌐 Internet bill pending! Stay connected.");
    }
}
