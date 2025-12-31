package com.hierarchicalinheritence;

public class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Daily Withdrawal Limit: ₹" + withdrawalLimit);
    }
}
