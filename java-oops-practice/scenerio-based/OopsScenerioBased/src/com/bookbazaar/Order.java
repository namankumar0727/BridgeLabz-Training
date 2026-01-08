package com.bookbazaar;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private String userName;
    private Map<Book, Integer> items = new HashMap<>();
    private String status = "CREATED"; // restricted

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            items.put(book, quantity);
        } else {
            System.out.println("Insufficient stock for " + book.getTitle());
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();

            double discount = book.applyDiscount(qty);
            total += (book.getPrice() * qty) - discount;
        }
        return total;
    }

    // Order status can only be updated internally
    protected void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }
}
