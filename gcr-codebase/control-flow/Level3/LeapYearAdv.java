import java.util.Scanner;

class LeapYearAdv{

	public static void main(String args[]){

	//Taking input of year
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Year");
	int inputYear=sc.nextInt();
	
	//Checking if the year is a leap year or not and printing the desired results
	if(inputYear>=1582 && (inputYear%4==0) && (inputYear%100!=0 || inputYear%400==0)){
				System.out.println("It is a leap Year");
	}	
	else{
		System.out.println("It is not a leap Year");
	}
		
}
}