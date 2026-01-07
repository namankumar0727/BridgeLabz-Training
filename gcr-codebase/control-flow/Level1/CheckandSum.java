import java.util.Scanner;

class CheckandSum{
	
	public static void main(String args[]){
		
		//Taking input of the numbers
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		//Checking if the number is natural of not	
		Boolean check=false;
		if(num>0) check=true;		
		
		//Calculating sum of the n natural numbers and printing the desired results
		if(check==true){
			int sum=num*(num+1)/2;
			System.out.println("The sum of "+num+" natural numbers is "+sum);
		}
		else{
			System.out.println("The number "+num+" is not a natural number");	
		}	
				
	}


}