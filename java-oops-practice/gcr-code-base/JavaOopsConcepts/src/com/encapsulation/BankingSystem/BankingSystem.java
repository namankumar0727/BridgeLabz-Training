package com.encapsulation.BankingSystem;

public public class BankingSystem {
    public static void main(String[] args) {

        BankAccount savings =
                new SavingsAccount("SA101", "Ravi", 60000);

        BankAccount current =
                new CurrentAccount("CA202", "Anita", 120000);

        savings.deposit(5000);
        savings.withdraw(2000);

        current.deposit(10000);

        BankingService.processAccount(savings);
        BankingService.processAccount(current);
    }
}
