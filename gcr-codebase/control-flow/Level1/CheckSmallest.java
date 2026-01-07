import java.util.Scanner;

class CheckSmallest{
	
	public static void main(String args[]){
		
		//Taking input of the numbers
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();

		//Minimum in these three numbers	
		int minNumber=Math.min(num1,Math.min(num2,num3));		

		//Checking if the first number is smallest in all three
		if(num1==minNumber){
			System.out.println("Is the first number the smallest? Yes");
		}
		else{
			System.out.println("Is the first number the smallest? No");
		} 
		
	}


}