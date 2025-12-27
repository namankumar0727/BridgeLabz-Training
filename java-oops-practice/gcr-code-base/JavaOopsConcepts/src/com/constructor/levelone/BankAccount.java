package com.constructor.levelone;

public class BankAccount {

	    // Public member (accessible everywhere)
	    public long accountNumber;

	    // Protected member (accessible in same package & subclasses)
	    protected String accountHolder;

	    // Private member (accessible only inside this class)
	    private double balance;

	    // Constructor
	    public BankAccount(long accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    // Public getter for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Public method to deposit amount
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }

	    // Public method to withdraw amount
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance or invalid amount");
	        }
	    }

}
