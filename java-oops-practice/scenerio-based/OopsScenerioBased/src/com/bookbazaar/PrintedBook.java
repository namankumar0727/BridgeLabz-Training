package com.bookbazaar;
public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        // Buy 2 or more → 15% discount
        if (quantity >= 2) {
            return price * quantity * 0.15;
        }
        return 0;
    }
}
