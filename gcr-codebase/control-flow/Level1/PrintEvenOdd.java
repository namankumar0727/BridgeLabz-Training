import java.util.Scanner;

class PrintEvenOdd{
	
	public static void main(String args[]){
		
		//Taking input of the number
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		//Checking if the number is natural of not	
		Boolean check=false;
		if(num>0) check=true;		
		
		//Printing Even Odd for each iteration
		if(check==true){
			for(int i=1;i<=num;i++){
				if(i%2==0){
					System.out.println("Number is Even "+i);
				}
				else{
					System.out.println("Number is Odd "+i);
				}
			}
		}
		else{
			System.out.println("The number "+num+" is not a natural number");	
		}	
				
	}


}