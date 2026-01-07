import java.util.Scanner;

class CheckLargest{
	
	public static void main(String args[]){
		
		//Taking input of the numbers
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();

		//Maximum in these three numbers	
		int maxNumber=Math.max(num1,Math.max(num2,num3));		

		//Checking if the first or second or third number is largest in all three numbers
		if(num1==maxNumber){
			System.out.println("Is the first number the largest? Yes");
			System.out.println("Is the second number the largest? No");
			System.out.println("Is the third number the largest? No");
		}
		else if(num2==maxNumber){
			System.out.println("Is the first number the largest? No");
			System.out.println("Is the second number the largest? Yes");
			System.out.println("Is the third number the largest? No");
		} 
		else{
			System.out.println("Is the first number the largest? No");
			System.out.println("Is the second number the largest? No");
			System.out.println("Is the third number the largest? yes");
		}
		
	}


}