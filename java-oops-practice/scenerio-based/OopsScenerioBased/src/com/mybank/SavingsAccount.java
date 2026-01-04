package com.mybank;

public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0; // %

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    double calculateInterest() {
        return getBalanceForInterest() * INTEREST_RATE / 100;
    }
}
