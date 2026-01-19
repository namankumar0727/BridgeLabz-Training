package com.eventmanager;
public class EventBookingPortal {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(101, 2500),
            new Ticket(102, 1200),
            new Ticket(103, 5000),
            new Ticket(104, 800),
            new Ticket(105, 3000),
            new Ticket(106, 1500)
        };

        System.out.println("Before Sorting:");
        EventManager.displayTickets(tickets);

        EventManager.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting (By Price):");
        EventManager.displayTickets(tickets);

        System.out.println("\nTop 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            tickets[i].display();
        }

        System.out.println("\nTop 3 Most Expensive Tickets:");
        for (int i = tickets.length - 1; i >= tickets.length - 3; i--) {
            tickets[i].display();
        }
    }
}
