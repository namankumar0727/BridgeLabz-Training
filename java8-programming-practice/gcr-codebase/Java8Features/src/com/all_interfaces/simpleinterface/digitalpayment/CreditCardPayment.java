package com.all_interfaces.simpleinterface.digitalpayment;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
