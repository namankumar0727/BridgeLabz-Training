package com.sorting.bubblesort;

import java.util.Scanner;

public class BubbleSortApp {
    public static void main(String[] args) {

        int[] studentMarks =new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++) {
        	studentMarks[i]=sc.nextInt();
        }

        System.out.println("Before Sorting - ");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }

        BubbleSortStudents.bubbleSort(studentMarks);

        System.out.println("\n\nAfter Sorting (Ascending) - ");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}
