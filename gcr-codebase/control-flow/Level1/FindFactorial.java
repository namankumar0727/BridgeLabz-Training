import java.util.Scanner;

class FindFactorial{
	
	public static void main(String args[]){
		
		//Taking input of the number
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		//Checking if the number is natural of not	
		Boolean check=false;
		if(num>0) check=true;		
		
		//Calculating Factorial of the Number
		if(check==true){
			int factorial=1;
			while(num>=1){
				factorial*=num;
				num--;
			}
			System.out.println("Factorial of the number is "+factorial);
		}
		else{
			System.out.println("The number "+num+" is not a natural number");	
		}	
				
	}


}