package com.multithreading.banktransactions;
import java.util.*;

public class Bank {

   private final Map<Integer, Integer> accounts = new HashMap<>();

   // Initialize an account with a starting balance
   public synchronized void createAccount(int accountNumber, int initialBalance) {
       accounts.put(accountNumber, initialBalance);
   }
    
   
   // deposit amount
   public synchronized void deposit(int accountNumber, int amount) {
       int currentBalance = accounts.get(accountNumber);
       accounts.put(accountNumber, currentBalance + amount);
       System.out.println(Thread.currentThread().getName()
               + " deposited " + amount + " into account " + accountNumber);
   }
    
   // withdraw amount
   public synchronized void withdraw(int accountNumber, int amount) {
	   
       int currentBalance = accounts.get(accountNumber);
       if (currentBalance >= amount) {
           accounts.put(accountNumber, currentBalance - amount);
           System.out.println(Thread.currentThread().getName()
                   + " withdrew " + amount + " from account " + accountNumber);
       } else {
           System.out.println(Thread.currentThread().getName()
                   + " attempted to withdraw " + amount
                   + " from account " + accountNumber + " (INSUFFICIENT FUNDS)");
       }
   }
    
    
    // check balance
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }
    
}
