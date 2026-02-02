package com.collectors.librarybook;
import java.util.*;
import java.util.stream.*;

public class LibraryStatisticsApp {
    public static void main(String[] args) {

        List<Book> books = List.of(
            new Book("Book A", "Fiction", 320),
            new Book("Book B", "Fiction", 450),
            new Book("Book C", "Science", 280),
            new Book("Book D", "Science", 510),
            new Book("Book E", "History", 600),
            new Book("Book F", "History", 420)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
                                                         .collect(Collectors.groupingBy(
                                                         Book::getGenre,
                                                         Collectors.summarizingInt(Book::getPages)));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages   : " + stats.getSum());
            System.out.println("  Average Pages : " + stats.getAverage());
            System.out.println("  Maximum Pages : " + stats.getMax());
        });
    }
}
