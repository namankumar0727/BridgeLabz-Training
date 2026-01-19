package com.smartshelf;
public class DigitalLibraryKiosk {
    public static void main(String[] args) {

        Book[] shelf = new Book[10];
        int count = 0;

        // Books added one-by-one (real-time)
        shelf[count++] = new Book("Java Programming", "James");
        SmartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Data Structures", "Mark");
        SmartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Algorithms", "Robert");
        SmartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Operating Systems", "Andrew");
        SmartShelf.insertionSort(shelf, count);

        System.out.println("Sorted Reading List:");
        SmartShelf.displayShelf(shelf, count);
    }
}
