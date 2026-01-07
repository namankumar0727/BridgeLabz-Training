package com.hierarchicalinheritence;

public class FixedDepositAccount extends BankAccount {
    int tenure; // in years

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Tenure: " + tenure + " years");
    }
}
