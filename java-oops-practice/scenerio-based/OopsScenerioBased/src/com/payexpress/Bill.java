package com.payexpress;
import java.time.LocalDate;

abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;

    private boolean isPaid;          // 🔒 cannot be changed directly
    private double paymentAmount;    // 🔐 internal payment detail

    // Constructor for recurring bills
    public Bill(String type, double amount, int dueInDays) {
        this.type = type;
        this.amount = amount;
        this.dueDate = LocalDate.now().plusDays(dueInDays);
        this.isPaid = false;
        registerBill();
    }

    private void registerBill() {
        System.out.println(type + " bill created. Due on: " + dueDate);
    }

    // Operator usage: base + penalty
    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Encapsulation: controlled payment
    @Override
    public void pay() {
        if (isPaid) {
            System.out.println(type + " bill already paid.");
            return;
        }

        paymentAmount = amount;
        isPaid = true;
        System.out.println(type + " bill paid: ₹" + paymentAmount);
    }

    public boolean isPaid() {
        return isPaid;
    }

    // Polymorphic behavior
    public abstract void sendReminder();
}
