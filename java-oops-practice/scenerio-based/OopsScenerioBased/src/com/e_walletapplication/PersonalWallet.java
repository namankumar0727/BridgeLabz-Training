package com.e_walletapplication;

public class PersonalWallet extends Wallet {

    PersonalWallet(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            System.out.println("Transferred ₹" + amount + " (Personal Wallet)");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
