package com.mybank;

public abstract class Account implements ITransaction {

    protected String accountNumber;
    private double balance;           

    // Constructor with opening balance
    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Constructor without opening balance
    Account(String accountNumber) {
        this(accountNumber, 0.0);
    }

    // Encapsulation: balance modification only via methods
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // Protected helper for subclasses
    protected double getBalanceForInterest() {
        return balance;
    }

    // Polymorphic method
    abstract double calculateInterest();

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
