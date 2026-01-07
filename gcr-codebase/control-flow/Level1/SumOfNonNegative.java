import java.util.Scanner;

class SumOfNonNegative{
	
	public static void main(String args[]){
		
		//Initializing two variables for storing sum and for values the user will enter 0
		double total=0;
		Scanner sc=new Scanner(System.in);
		double userValue=sc.nextDouble();
				
		
		//Sum Of Numbers till 0 or negative number gets entered by user
		while(true)
		{	
			if(userValue<=0){
				break;
			}
			total+=userValue;
			userValue=sc.nextDouble();
		}
		
		//Printing the desired total of the non-negative numbers
		System.out.println(total);
	}
}