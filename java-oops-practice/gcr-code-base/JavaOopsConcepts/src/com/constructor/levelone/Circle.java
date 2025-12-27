package com.constructor.levelone;

public class Circle {

	    double radius;

	    // Default Constructor
	    public Circle() {
	        this(1.0);   
	    }

	    // Parameterized Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to display radius
	    public void display() {
	        System.out.println("Radius: " + radius);
	    }

}
