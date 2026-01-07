import java.util.Scanner;

class LeapYearBasic{

	public static void main(String args[]){

	//Taking input of year
	Scanner sc=new Scanner(System.in);
	int inputYear=sc.nextInt();
	
	//Checking if the year is a leap year or not and printing the desired results
	if(inputYear>=1582){
		if(inputYear%4==0 && inputYear%100==0){
			if(inputYear%400==0){
				System.out.println("It is a leap Year");
			}
			else{
				System.out.println("It is a not a leap Year");
			}
		} 
		else{
			System.out.println("It is not a leap Year");
		}
	}	
	else{
		System.out.println("It is not a leap Year");
	}
	}
		
}