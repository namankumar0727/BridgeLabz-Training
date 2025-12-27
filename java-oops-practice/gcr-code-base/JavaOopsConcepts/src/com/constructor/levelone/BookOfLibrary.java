package com.constructor.levelone;

public class BookOfLibrary {

	    // Public member 
	    public String ISBN;

	    // Protected member 
	    protected String title;

	    // Private member
	    private String author;

	    // Constructor
	    public BookOfLibrary(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    // Setter for author 
	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    // Getter for author
	    public String getAuthor() {
	        return author;
	    }
}
