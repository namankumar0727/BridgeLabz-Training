package com.constructor.levelone;

public class LibraryBook {

	    String title;
	    String author;
	    double price;
	    boolean available;

	    // Parameterized Constructor
	    public LibraryBook(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.available = true; // book is available initially
	    }

	    // Method to borrow a book
	    public void borrowBook() {
	        if (available) {
	            available = false;
	            System.out.println("Book borrowed successfully.");
	        } else {
	            System.out.println("Sorry, the book is currently not available.");
	        }
	    }

	    // Method to display book details
	    public void displayDetails() {
	        System.out.println("Title        : " + title);
	        System.out.println("Author       : " + author);
	        System.out.println("Price        : " + price);
	        System.out.println("Availability : " + (available ? "Available" : "Not Available"));
	    
	    }
	}
