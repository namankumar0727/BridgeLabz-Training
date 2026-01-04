package com.e_walletapplication;

public class BusinessWallet extends Wallet {

    private static final double TRANSACTION_FEE = 0.05; 

    BusinessWallet(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double fee = amount * TRANSACTION_FEE;
        double total = amount + fee;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            System.out.println("Transferred ₹" + amount +
                    " (Business Wallet, Fee: ₹" + fee + ")");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
