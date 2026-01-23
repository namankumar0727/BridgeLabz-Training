package com.tailorshop;
class Order {
    int orderId;
    int deadline; // deadline in days (smaller = earlier delivery)

    Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + " | Deadline: Day " + deadline;
    }
}
