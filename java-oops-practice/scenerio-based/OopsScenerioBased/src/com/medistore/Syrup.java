package com.medistore;
import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Syrups expire 30 days before actual expiry date
        return LocalDate.now().isAfter(expiryDate.minusDays(30));
    }
}
