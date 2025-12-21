import java.util.Scanner;
class CheckingYearLeap{
	
	//Method to check if the year is a leap year or not
	public static boolean checkLeapYear(int year){
	
		if(year<1582){
			return false;
		}
		if(year%400==0){
			return true;
		}
		if(year%4==0 && year%100!=0){
			return true;
		}	
		return false;
	}
	
	public static void main(String args[]){
	
		//Taking input of the year from the user
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();	
		
		//Calling method to check if the year is a leap year or not...
		if(checkLeapYear(year)){
			System.out.println("It is a Leap Year");
		}
		else{
			System.out.println("It is not a Leap Year");
		}
	}
}

