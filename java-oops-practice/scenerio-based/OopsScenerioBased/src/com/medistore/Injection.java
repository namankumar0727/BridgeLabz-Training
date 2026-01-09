package com.medistore;
import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Injections expire 15 days before actual expiry
        return LocalDate.now().isAfter(expiryDate.minusDays(15));
    }
}
