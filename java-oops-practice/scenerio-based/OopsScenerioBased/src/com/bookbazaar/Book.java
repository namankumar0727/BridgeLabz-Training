package com.bookbazaar;
public abstract class Book implements IDiscountable {
    protected String title;
    protected String author;
    protected double price;
    private int stock; // encapsulated

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Constructor with optional offer (discounted price)
    public Book(String title, String author, double price, int stock, double offerPrice) {
        this(title, author, offerPrice, stock);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Inventory can be updated only via this method
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }
}
