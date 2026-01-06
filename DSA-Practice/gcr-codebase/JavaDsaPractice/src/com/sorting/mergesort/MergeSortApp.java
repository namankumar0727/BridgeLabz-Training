package com.sorting.mergesort;

import java.util.Scanner;

public class MergeSortApp {
    public static void main(String[] args) {

    	//Taking the inputs from the user
        double[] bookPrices = new double[5];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;i++) {
        	bookPrices[i]=sc.nextDouble();
        }

        //Printing the array before sorting
        System.out.println("Before Sorting:");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }

        //Calling
        MergeSortBooks.mergeSort(bookPrices, 0, bookPrices.length - 1);

        
        //Displaying the array after sorting
        System.out.println("\n\nAfter Sorting (Ascending):");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
