import java.util.Scanner;
class CalculateSimpleInterest{

	//Method to Calculate Simple Interest
	static double calculateSI(double p,double r,double t){
		return (p*r*t)/100;
	}
	public static void main(String args[]){
	
		//Taking input of principle,rate and time from user
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();	
		
		//Calling method calculateSI
		double simpleInterest=calculateSI(p,r,t);
		
		//Displaying Simple interest
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+p+", Rate of Interest "+r+" and Time "+t);
	}
}
