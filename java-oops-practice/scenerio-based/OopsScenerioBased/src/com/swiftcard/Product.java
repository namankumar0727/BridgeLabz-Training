package com.swiftcard;
abstract class Product {

	//Variables 
    protected String name;
    protected double price;
    protected String category;

    //Constructors
    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Polymorphic discount method
    abstract double getDiscountRate();
}
