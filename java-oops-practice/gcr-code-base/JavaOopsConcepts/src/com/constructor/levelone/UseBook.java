package com.constructor.levelone;

public class UseBook {

	public static void main(String[] args) {
		
		        // Using Default Constructor
		        Book book1 = new Book();
		        book1.displayDetails();

		        // Using Parameterized Constructor
		        Book book2 = new Book("book1","NamanKumar", 500.50);
		        book2.displayDetails();
		    }
		

	}
