package com.multithreading.banktransactions;

public class BankManagementSystem {

	public static void main(String[] args) throws Exception {
		
		Bank bank = new Bank();

        // Create accounts
        bank.createAccount(1, 500);
        bank.createAccount(2, 300);
        
        // Create customers (threads)
        Customer c1 = new Customer("Customer-1", bank, 1);
        Customer c2 = new Customer("Customer-2", bank, 1);
        Customer c3 = new Customer("Customer-3", bank, 2);
        
        
        // Start threads
        c1.start();
        c2.start();
        c3.start();

        // Wait for all threads to finish
        c1.join();
        c2.join();
        c3.join();

        // Print final balances
        System.out.println("\nFinal Account Balances:");
        System.out.println("Account 1: " + bank.getBalance(1));
        System.out.println("Account 2: " + bank.getBalance(2));
        
	}
}
