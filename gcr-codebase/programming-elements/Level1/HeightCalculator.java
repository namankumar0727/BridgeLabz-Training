import java.util.Scanner;

class HeightCalculator{


	public static void main(String args[]){
		
		//Taking input of height in cms
		Scanner sc=new Scanner(System.in);	
		double height=sc.nextDouble();

		//Conversion of height in cms to feet and inches
		double inches=height/2.54;
		double foot=inches/12;

		//printing height in feet and inches
		System.out.println("Your Height in cm is "+height+" while in feet is "+foot+" and inches is "+inches);
	}
}
		