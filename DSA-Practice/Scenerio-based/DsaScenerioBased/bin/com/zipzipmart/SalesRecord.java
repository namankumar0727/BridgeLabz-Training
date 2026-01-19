package com.zipzipmart;
import java.time.LocalDate;

class SalesRecord {
    private int billId;
    private LocalDate date;
    private double amount;

    public SalesRecord(int billId, LocalDate date, double amount) {
        this.billId = billId;
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void display() {
        System.out.println(
            "BillID: " + billId +
            ", Date: " + date +
            ", Amount: ₹" + amount
        );
    }
}
