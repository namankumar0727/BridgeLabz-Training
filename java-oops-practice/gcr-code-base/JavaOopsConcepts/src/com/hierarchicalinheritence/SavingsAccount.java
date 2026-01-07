package com.hierarchicalinheritence;

public class SavingsAccount extends BankAccount {
	
	//variables
    double interestRate;

    //constructors
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
