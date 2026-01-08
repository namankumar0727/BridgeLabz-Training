package com.bookbazaar;
public class Main {
    public static void main(String[] args) {

        Book ebook = new EBook("Clean Code", "Robert Martin", 500, 100);
        Book printedBook = new PrintedBook("Effective Java", "Joshua Bloch", 800, 50);

        Order order = new Order("Amit");

        order.addBook(ebook, 2);
        order.addBook(printedBook, 3);

        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Total Amount: ₹" + order.calculateTotal());
    }
}
