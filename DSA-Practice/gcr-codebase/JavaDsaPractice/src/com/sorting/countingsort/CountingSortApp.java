package com.sorting.countingsort;

import java.util.Scanner;

public class CountingSortApp {
    public static void main(String[] args) {

        int[] studentAges =new int[8];
        
        //Taking the inputs from the user
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i++) {
        	studentAges[i]=sc.nextInt();
        }

        System.out.println("Before Sorting - ");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }

        CountingSortAges.countingSort(studentAges);

        System.out.println("\n\n After Sorting - (Ascending):");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}
