package com.smartchekout;
import java.util.Arrays;

public class SmartCheckout {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        CheckoutQueue counter = new CheckoutQueue(inventory);

        Customer c1 = new Customer("Amit",
                Arrays.asList("Milk", "Bread"));

        Customer c2 = new Customer("Neha",
                Arrays.asList("Eggs", "Milk", "Milk"));

        counter.addCustomer(c1);
        counter.addCustomer(c2);

        counter.processCustomer();
        counter.processCustomer();
        counter.processCustomer(); // empty queue case
    }
}
