package com.smartchekout;
import java.util.LinkedList;
import java.util.Queue;

class CheckoutQueue {
    private Queue<Customer> queue = new LinkedList<>();
    private Inventory inventory;

    public CheckoutQueue(Inventory inventory) {
        this.inventory = inventory;
    }

    public void addCustomer(Customer c) {
        queue.add(c);
        System.out.println(c.getName() + " joined the queue");
    }

    public void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = queue.poll();
        int totalBill = 0;

        System.out.println("\nBilling for: " + c.getName());

        for (String item : c.getItems()) {
            if (inventory.updateStock(item)) {
                int price = inventory.getPrice(item);
                totalBill += price;
                System.out.println(item + " : ₹" + price);
            } else {
                System.out.println(item + " : Out of stock");
            }
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }
}
