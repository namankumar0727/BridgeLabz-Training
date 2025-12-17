import java.util.Scanner;
class DistanceCalculator{

	
	public static void main(String args[]){

		//Taking user input for Distance in KM
		Scanner sc=new Scanner(System.in);
		double km=sc.nextInt();

		//Conversion of Distance in Miles
		double miles=km*1.6;
	
		//Priting Km in Miles
		System.out.println("The total miles is "+miles+" miles for the given "+km+" km");


	}


}