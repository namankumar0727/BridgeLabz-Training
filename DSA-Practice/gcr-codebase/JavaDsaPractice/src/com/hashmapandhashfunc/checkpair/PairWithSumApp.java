package com.hashmapandhashfunc.checkpair;
public class PairWithSumApp {
    public static void main(String[] args) {

        int[] arr = new int[7];
        
        Scanner sc-new Scanner(System.in);
        for(int i=0;i<7;i++) {
        	arr[i]=sc.nextInt();
        }
        
        	int target = 10;
        

        boolean exists = PairWithGivenSum.hasPairWithSum(arr, target);
        System.out.println("Pair exists is  " + exists);
    }
}
