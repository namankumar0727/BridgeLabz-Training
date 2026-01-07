import java.util.Scanner;

class CheckDivisible{
	
	public static void main(String args[]){
		
		//Taking input of the number
		Scanner sc=new Scanner(System.in);
		int inputNumber=sc.nextInt();	
		
		//Checking if the number is divisible by 5 and printing yes or No
		if(inputNumber%5==0){
			System.out.println("Is the number "+inputNumber+" divisible by 5? Yes");
		}
		else{
			System.out.println("Is the number "+inputNumber+" divisible by 5? No");
		} 
		
	}


}