package com.constructor.levelone;

public class UseBankAccount {

	    public static void main(String[] args) {

	        SavingsAccount sa =
	                new SavingsAccount(123456789L, "Naman", 25000, 4.5);

	        sa.displayAccountDetails();

	        // Modifying balance using public methods
	        sa.deposit(5000);
	        sa.withdraw(3000);

	        System.out.println("Updated Balance: " + sa.getBalance());
	    }

}
