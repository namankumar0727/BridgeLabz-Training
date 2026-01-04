package com.e_walletapplication;

public class E_WalletApplication {
    public static void main(String[] args) {

        User u1 = new User(
                "Naman",
                new PersonalWallet(1000),
                true
        );

        User u2 = new User(
                "abc",
                new BusinessWallet(5000),
                false
        );

        u1.displayUser();
        u2.displayUser();

        System.out.println();

        // Polymorphism: same method, different behavior
        u1.getWallet().transferTo(u2, 300);
        u2.getWallet().transferTo(u1, 500);

        System.out.println();

        u1.displayUser();
        u2.displayUser();

        System.out.println("\nRavi Transaction History:");
        u1.getWallet().showTransactions();
    }
}
