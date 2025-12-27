package com.constructor.levelone;

public class Product {
	
	// Instance variables
	
	    String productName;
	    double price;

	    // Class variable (shared among all objects)
	    static int totalProducts = 0;

	    // Parameterized Constructor
	    public Product(String productName, double price) {
	        this.productName = productName;
	        this.price = price;
	        totalProducts++;   // increments when a new product is created
	    }

	    // Instance method
	    public void displayProductDetails() {
	        System.out.println("Product Name : " + productName);
	        System.out.println("Price        : ₹" + price);
	        System.out.println("-------------------------");
	    }

	    // Class method
	    public static void displayTotalProducts() {
	        System.out.println("Total Products Created: " + totalProducts);
	    }
	}
