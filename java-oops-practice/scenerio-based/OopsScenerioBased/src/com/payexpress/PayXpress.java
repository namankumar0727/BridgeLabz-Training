package com.payexpress;
public class PayXpress {
    public static void main(String[] args) {

        Bill electricity = new ElectricityBill(1200);
        Bill internet = new InternetBill(800);
        Bill water = new WaterBill(500);

        electricity.sendReminder();
        electricity.pay();

        internet.sendReminder();
        internet.pay();

        water.sendReminder();

        // Late fee example
        double lateAmount = electricity.calculateLateFee(100);
        System.out.println("Electricity bill with late fee: ₹" + lateAmount);
    }
}
