package com.singleinheritence;

public  class LibraryManagement{
    public static void main(String[] args) {

        Author book1 = new Author(
                "Effective Java",
                2026,
                "Naman Kumar",
                "All concepts of java"
        );

        book1.displayInfo();
    }
}
