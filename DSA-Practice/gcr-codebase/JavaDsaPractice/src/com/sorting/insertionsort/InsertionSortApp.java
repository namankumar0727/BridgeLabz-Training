package com.sorting.insertionsort;

import java.util.*;

public class InsertionSortApp {
    public static void main(String[] args) {

    	//Taking inputs from the user
        int[] employeeIds = new int[5];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;i++) {
        	employeeIds[i]=sc.nextInt();
        }

        //Printing the array before sorting
        System.out.println("Before Sorting:");
        for (int id:employeeIds) {
            System.out.print(id+" ");
        }

        //Calling the functions
        InsertionSortEmployees.insertionSort(employeeIds);

        //Printing the array after sorting
        System.out.println("\n\n After Sorting - Ascending");
        for (int id : employeeIds) {
            System.out.print(id+" ");
        }
    }
}
