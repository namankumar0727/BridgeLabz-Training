import java.util.Scanner;

class CheckNumber{
	
	public static void main(String args[]){
		
		//Taking input of the Number
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();	
		
		//Checking if the number is positive or negative or zero
		if(number>0){
			System.out.println("Positive");
		}
		else if(number<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
		
	}


}