package com.medistore;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Medicine tablet = new Tablet(
                "Paracetamol",
                5.0,
                LocalDate.of(2026,5,20)
        );

        Medicine syrup = new Syrup(
                "Cough Syrup",
                120.0,
                LocalDate.of(2026,3,15),
                50
        );

        Medicine injection = new Injection(
                "Insulin",
                300.0,
                LocalDate.of(2026,2,10)
        );

        System.out.println("Tablet Sale Amount: ₹" + tablet.sell(10));
        System.out.println("Syrup Sale Amount: ₹" + syrup.sell(5));
        System.out.println("Injection Sale Amount: ₹" + injection.sell(2));
    }
}
