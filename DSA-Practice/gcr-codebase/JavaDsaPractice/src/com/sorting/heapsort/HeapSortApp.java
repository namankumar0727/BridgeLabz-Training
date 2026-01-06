package com.sorting.heapsort;
public class HeapSortApp {
    public static void main(String[] args) {

        int[] salaryDemands = {75000, 50000, 120000, 90000, 60000};

        System.out.println("Before Sorting:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }

        HeapSortSalaries.heapSort(salaryDemands);

        System.out.println("\n\nAfter Sorting (Ascending):");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}
