package com.sorting.selectionsort;

import java.util.Scanner;

public class SelectionSortApp {
    public static void main(String[] args) {

    	//Taking inputs from the user
        int[] examScores=new int[5];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;i++) {
        	examScores[i]=sc.nextInt();
        }

        //Diplaying the array before sorting
        System.out.println("Before Sorting:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }

        SelectionSortExamScores.selectionSort(examScores);

        //Diplaying the array after sorting
        System.out.println("\n\nAfter Sorting (Ascending):");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
