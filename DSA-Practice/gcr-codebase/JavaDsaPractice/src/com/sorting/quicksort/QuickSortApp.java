package com.sorting.quicksort;

import java.util.Scanner;

public class QuickSortApp {
    public static void main(String[] args) {

        double[] productPrices=new double[5];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;i++) {
        	productPrices[i]=sc.nextDouble();
        }

        //Displaying the array before sorting
        System.out.println("Before Sorting-");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }

        //Calling
        QuickSortProducts.quickSort(productPrices, 0, productPrices.length - 1);

        //After sorting the array
        System.out.println("\n\nAfter Sorting-(Ascending):");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
