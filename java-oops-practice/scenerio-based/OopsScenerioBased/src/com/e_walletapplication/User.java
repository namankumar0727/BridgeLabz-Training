package com.e_walletapplication;

public class User {
    private String name;
    private Wallet wallet;

    // Constructor with optional referral bonus
    User(String name, Wallet wallet, boolean referralBonus) {
        this.name = name;
        this.wallet = wallet;

        if (referralBonus) {
            wallet.addBalance(100); // referral bonus
        }
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void displayUser() {
        System.out.println("User: " + name);
        System.out.println("Balance: ₹" + wallet.getBalance());
    }
}
