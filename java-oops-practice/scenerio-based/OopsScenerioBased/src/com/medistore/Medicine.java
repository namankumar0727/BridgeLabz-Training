package com.medistore;
import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected LocalDate expiryDate;
    private int quantity;           // encapsulated stock
    private final double discountRate = 0.05; // sensitive pricing logic

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 100);
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated stock update
    protected boolean reduceStock(int units) {
        if (units <= quantity) {
            quantity -= units;
            return true;
        }
        return false;
    }

    // Sensitive pricing logic hidden
    private double applyDiscount(double total) {
        return total - (total * discountRate);
    }

    @Override
    public double sell(int units) {
        if (checkExpiry()) {
            System.out.println(name + " is expired. Cannot sell.");
            return 0;
        }

        if (reduceStock(units)) {
            double total = price * units; // operator usage
            return applyDiscount(total);
        } else {
            System.out.println("Insufficient stock for " + name);
            return 0;
        }
    }
}
