package com.constructor.levelone;

public class EBook extends BookOfLibrary {

    String fileFormat;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Method to display accessible details
    public void displayEBookDetails() {
        System.out.println("ISBN        : " + ISBN);    
        System.out.println("Title       : " + title);  
        System.out.println("File Format : " + fileFormat);
        System.out.println("Author      : " + getAuthor()); 
        System.out.println("----------------------------");
    }
}

