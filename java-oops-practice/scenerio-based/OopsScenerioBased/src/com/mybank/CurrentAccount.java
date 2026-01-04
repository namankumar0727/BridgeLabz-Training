package com.mybank;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.0; // %

    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    double calculateInterest() {
        return getBalanceForInterest() * INTEREST_RATE / 100;
    }
}
