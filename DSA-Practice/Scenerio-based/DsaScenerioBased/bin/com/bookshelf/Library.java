package com.bookshelf;
import java.util.*;

public class Library {
	
    private Map<String, LinkedList<Book>> catalog;
    private Set<String> isbnSet; 

    public Library() {
        catalog = new HashMap<>();
        isbnSet = new HashSet<>();
    }

    // Add Book
    public void addBook(String genre, Book book) {
        if (isbnSet.contains(book.getIsbn())) {
            System.out.println("Duplicate books not allowed.");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        isbnSet.add(book.getIsbn());

        System.out.println("Book added successfully.");
    }

    // Remove Book (Borrow)
    public void removeBook(String isbn) {
        for (LinkedList<Book> books : catalog.values()) {
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book book = iterator.next();
                if (book.getIsbn().equals(isbn)) {
                    iterator.remove();
                    isbnSet.remove(isbn);
                    System.out.println("Book borrowed successfully.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    // Display Catalog
    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("📭 Library is empty.");
            return;
        }

        for (String genre : catalog.keySet()) {
            System.out.println("\n Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println(" - " + book);
            }
        }
    }
}
