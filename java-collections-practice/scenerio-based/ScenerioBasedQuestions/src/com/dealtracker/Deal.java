package com.dealtracker;

import java.time.LocalDate;

public class Deal extends Promotion {

    private LocalDate validTill;
    private int discount;
    private int minimumPurchase;

    public Deal(String code, LocalDate validTill,
                int discount, int minimumPurchase) {
        super(code);
        this.validTill = validTill;
        this.discount = discount;
        this.minimumPurchase = minimumPurchase;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return code + " | " + discount + "% | Min: "
                + minimumPurchase + " | Valid Till: " + validTill;
    }
}
