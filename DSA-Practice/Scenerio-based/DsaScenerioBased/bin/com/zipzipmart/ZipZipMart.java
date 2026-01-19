package com.zipzipmart;
import java.time.LocalDate;

public class ZipZipMart {
    public static void main(String[] args) {

        SalesRecord[] records = {
            new SalesRecord(101, LocalDate.of(2026, 1, 10), 500),
            new SalesRecord(102, LocalDate.of(2026, 1, 8), 1200),
            new SalesRecord(103, LocalDate.of(2026, 1, 10), 300),
            new SalesRecord(104, LocalDate.of(2026, 1, 5), 900),
            new SalesRecord(105, LocalDate.of(2026, 1, 8), 700)
        };

        System.out.println("Before Sorting:");
        ZipZipSorter.display(records);

        ZipZipSorter.mergeSort(records, 0, records.length - 1);

        System.out.println("\nAfter Sorting (Date → Amount):");
        ZipZipSorter.display(records);
    }
}
