package com.e_walletapplication;

import java.util.ArrayList;
import java.util.List;

abstract class Wallet implements Transferrable {

    private double balance;
    private List<Transaction> transactions;

    Wallet(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
        transactions.add(new Transaction("Credit", amount));
    }

    protected boolean deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t.getSummary());
        }
    }
}
