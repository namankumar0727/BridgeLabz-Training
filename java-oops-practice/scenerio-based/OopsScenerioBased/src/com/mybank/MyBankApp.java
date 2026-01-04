package com.mybank;

public class MyBankApp {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount("SB101", 50000);
        Account acc2 = new CurrentAccount("CA202");

        acc1.deposit(5000);
        acc1.withdraw(2000);

        acc2.deposit(30000);

        System.out.println("\n Savings Account Details:");
        acc1.displayAccount();
        System.out.println("Interest is about - ₹" + acc1.calculateInterest());

        System.out.println("\n Current Account Details:");
        acc2.displayAccount();
        System.out.println("Interest is about - ₹" + acc2.calculateInterest());
    }
}
