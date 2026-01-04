package com.hashmapandhashfunc.twosum;
import java.util.*;
public class TwoSumApp {
    public static void main(String[] args) {

    	//Taking the input from the user
    	Scanner sc=new Scanner(System.in);
    	int n=5;
        int[] nums = new int[5];
        for(int i=0;i<n;i++) {
        	nums[i]=sc.nextInt();
        }
        int target = 9;

        //Calling the function
        int[] result = TwoSumSolver.twoSum(nums,target);

        
        //printing out the desired results
        System.out.println("Indices are -  "+ result[0]+","+result[1]);
    }
}
