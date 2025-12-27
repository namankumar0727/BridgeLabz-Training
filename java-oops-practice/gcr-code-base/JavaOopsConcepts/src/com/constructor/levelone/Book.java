package com.constructor.levelone;

public class Book {

    // Attributes
    public String title;
    public String author;
    public double price;

    // Default Constructor
    public Book() {
        title = "Not Defined";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}
