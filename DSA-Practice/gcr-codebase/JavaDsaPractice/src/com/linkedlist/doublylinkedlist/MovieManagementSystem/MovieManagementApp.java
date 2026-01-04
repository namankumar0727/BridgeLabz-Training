package com.linkedlist.doublylinkedlist.MovieManagementSystem;

public class MovieManagementApp {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("Stranger Things", "The Duffer Brothers", 2025,9.5);
        movies.addAtEnd("Oppenheimer", "Christopher Nolan", 2024, 10);
        movies.addAtEnd("Bhey", "Underrated Director", 2025, 8.2);

        movies.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.8);

        System.out.println("All Movies (Forward):");
        movies.displayForward();

        System.out.println("\n Movies by Director James Cameron:");
        movies.searchByDirector("James Cameron");

        System.out.println("\n Movies with Rating >= 8.0:");
        movies.searchByRating(8.0);

        System.out.println("\n Updating Rating of Avatar:");
        movies.updateRating("Avatar", 8.2);

        System.out.println("\n Removing Titanic:");
        movies.removeByTitle("Titanic");

        System.out.println("\n All Movies (Reverse):");
        movies.displayReverse();
    }
}
