package com.hashmapandhashfunc.findsubarrays;

import java.util.Scanner;

public class ZeroSumSubarrayApp {
    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);
        int[] arr =new int[8];
        
        for(int i=0;i<8;i++) {
        	arr[i]=sc.nextInt();
        }

        ZeroSumSubarrays.findAllZeroSumSubarrays(arr);
    }
}
