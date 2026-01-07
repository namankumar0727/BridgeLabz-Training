import java.util.Scanner;

class IntOperationCalculator{
	
	public static void main(String args[]){
		
		//Taking inputs from the user for the three variable;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
			
		//Implementing the int operations on three variables
		int result1=a + b *c;
		int result2=a * b + c;
		int result3=c + a / b;
		int result4=a % b + c;

		//printing the output of the int operations		
		System.out.println("The results of Int Operations are "+result1+" , "+result2+" , "+result3+" and "+result4);
	}
	
}