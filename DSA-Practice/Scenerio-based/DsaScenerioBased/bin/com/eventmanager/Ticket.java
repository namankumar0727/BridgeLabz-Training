package com.eventmanager;
class Ticket {
    private int ticketId;
    private double price;

    public Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Ticket ID: " + ticketId + ", Price: ₹" + price);
    }
}
