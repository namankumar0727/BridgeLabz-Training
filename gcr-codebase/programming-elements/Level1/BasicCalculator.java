import java.util.Scanner;

class BasicCalculator{


	public static void main(String args[]){
		
		//Taking input of number1 and number2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");	
		float number1=sc.nextFloat();
		System.out.println("Enter first Number");
		float number2=sc.nextFloat();

		//Basic Calculation of two numbers
		float addition=number1+number2;
		float substraction=number1-number2;
		float multiplication=number1*number2;
		float division=number1/number2;


		//printing answers of basic calculations
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+" , "+substraction+" , "+multiplication+" and "+division);
		
		}
}
		