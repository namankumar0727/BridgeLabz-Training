package com.smartshelf;
class SmartShelf {

    // Insertion Sort by book title (A → Z)
    public static void insertionSort(Book[] books, int size) {

        for (int i = 1; i < size; i++) {
            Book key = books[i];
            int j = i - 1;

            // Shift larger titles to the right
            while (j >= 0 &&
                   books[j].getTitle()
                           .compareToIgnoreCase(key.getTitle()) > 0) {

                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void displayShelf(Book[] books, int size) {
        for (int i = 0; i < size; i++) {
            books[i].display();
        }
    }
}
