import java.util.Scanner;

class DoubleOperationCalculator{
	
	public static void main(String args[]){
		
		//Taking inputs from the user for the three variable;
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
			
		//Implementing the int operations on three variables
		double result1=a + b *c;
		double result2=a * b + c;
		double result3=c + a / b;
		double result4=a % b + c;

		//printing the output of the int operations		
		System.out.println("The results of Int Operations are "+result1+" , "+result2+" , "+result3+" and "+result4);
	}
	
}