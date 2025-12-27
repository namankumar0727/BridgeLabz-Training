package com.constructor.levelone;

public class UseLibraryBook {
	    public static void main(String[] args) {

	        Book b1 = new Book("Clean Code", "Robert C. Martin", 550.0);

	        b1.displayDetails();

	        // Borrowing the book
	        b1.borrowBook();

	        b1.displayDetails();

	        // Trying to borrow again
	        b1.borrowBook();
	 
	}


}
