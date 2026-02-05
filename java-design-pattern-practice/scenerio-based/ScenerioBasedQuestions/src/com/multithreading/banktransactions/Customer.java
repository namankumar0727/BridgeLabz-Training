package com.multithreading.banktransactions;

public class Customer extends Thread{
	
  private final Bank bank;
  private final int accountNumber;
  
  public Customer(String name,Bank bank, int accountNumber) {
	  super(name);
	  this.bank = bank;
	  this.accountNumber = accountNumber;
  }
  
 
  @Override
  public void run() {
	  bank.deposit(accountNumber, 1000);
	  sleepBriefly();
	  
	  bank.withdraw(accountNumber, 50);
      sleepBriefly();

      bank.deposit(accountNumber, 200);
      sleepBriefly();

      bank.withdraw(accountNumber, 150);
	  
  }
  
  private void sleepBriefly() {
      try {
          Thread.sleep(100);
      } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
      }
  }
  
  
}
