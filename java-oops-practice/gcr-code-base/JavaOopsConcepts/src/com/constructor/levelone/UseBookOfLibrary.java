package com.constructor.levelone;

public class UseBookOfLibrary {


    public static void main(String[] args) {

        EBook ebook = new EBook(
                "978-0134685991",
                "OOPs",
                "Naman kumar",
                "PDF"
        );

        ebook.displayEBookDetails();

        // Modifying author using public setter
        ebook.setAuthor("Naman kumar");

        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}

