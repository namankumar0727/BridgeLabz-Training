package com.bookshelf;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
    	
    	//Taking the inputs from the user....
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n Library Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. View Catalog");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    library.addBook(genre, new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow: ");
                    String removeIsbn = sc.nextLine();
                    library.removeBook(removeIsbn);
                    break;

                case 3:
                    library.displayCatalog();
                    break;

                case 4:
                    System.out.println("Exiting Library System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
