import java.util.Scanner;
class FindQuotientRemainder{

	//Method to calculate the Quotient and the remainder
	public static int[] findRemainderAndQuotient(int num,int divisor){
		int quotient=num/divisor;
		int remainder=num%divisor;
		return new int[]{quotient,remainder};
	}
	
	public static void main(String args[]){
	
		//Taking input of two numbers
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int divisor=sc.nextInt();
		
		//Calling method findRemainderAndQuotient
		int result[]=findRemainderAndQuotient(num,divisor);
		
		//Printing the desired quotient and remainder
		System.out.println("Quotient is "+result[0]);
		System.out.println("Remainder is "+result[1]);
	}
}

