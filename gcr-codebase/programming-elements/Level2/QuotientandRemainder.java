import java.util.Scanner;
class QuotientAndRemainder{

	
	public static void main(String args[]){
		
		//Taking inputs of number1 and number2
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		//Calculation of Quotient and Remainder
		int quotient=num1/num2;
		int remainder=num1%num2;
		
		//Printing of Quotient and Remainder
		System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+num1+" and "+num2);
		
	}
	

}