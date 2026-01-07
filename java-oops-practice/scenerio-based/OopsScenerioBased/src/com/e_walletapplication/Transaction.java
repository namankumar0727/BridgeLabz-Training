package com.e_walletapplication;

public class Transaction {
	
	//Declaration
    private String type;
    private double amount;

    //Constructor
    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getSummary() {
        return type + " : ₹" + amount;
    }
}

