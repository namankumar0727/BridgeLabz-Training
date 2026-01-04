package com.stackandqueues.stockspan;
import java.util.Scanner;
public class StockSpanApp {
    public static void main(String[] args) {

        int prices[]=new int[9];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++) {
        	prices[i]=sc.nextInt();
        }

        int[] span = StockSpanCalculator.calculateSpan(prices);

        System.out.print("Stock Spans -> ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
