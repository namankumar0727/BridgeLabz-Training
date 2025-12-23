import java.util.Scanner;
public class CompareSum{

	//Recursive method to find sum
	public static int sum(int n){
	
		if(n==0){
			return 0;
		}
		return n+sum(n-1);
	}

	//Method to find sum using formula
	public static int sumFormula(int n){
		return n*(n+1)/2;
	}
	
	
	public static void main(String args[]){
	
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0){
			System.out.println("Invalid");
			return;
		}
	
		//Calling methods to calculate sum using recursion and with formula
		int r1=sum(n);
		int r2=sumFormula(n);
	
		//Printing sum in both the calculations
		System.out.println("Recursion sum is "+r1);
		System.out.println("Formula sum is "+r2);
	}
}
