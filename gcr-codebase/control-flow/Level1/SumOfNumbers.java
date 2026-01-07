import java.util.Scanner;

class SumOfNumbers{
	
	public static void main(String args[]){
		
		//Initializing two variables for storing sum and for values the user will enter 0
		double total=0;
		Scanner sc=new Scanner(System.in);
		double userValue=sc.nextDouble();
				
		
		//Sum Of Numbers till 0 gets entered by user
		while(userValue!=0)
		{
			total+=userValue;
			userValue=sc.nextDouble();
		}
		System.out.println(total);
	}
}