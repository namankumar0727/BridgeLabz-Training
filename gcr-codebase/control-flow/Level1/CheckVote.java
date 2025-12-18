import java.util.Scanner;

class CheckVote{
	
	public static void main(String args[]){
		
		//Taking input of the age of the person
		Scanner sc=new Scanner(System.in);
		int inputAge=sc.nextInt();	
		
		//Checking if the person can vote or not and priting the desired results
		if(inputAge>=18){
			System.out.println("The person's age is "+inputAge+" and can vote.");
		}
		else{
			System.out.println("The person's age is "+inputAge+" and cannot vote.");
		} 
		
	}


}
