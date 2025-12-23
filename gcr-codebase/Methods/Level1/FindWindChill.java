import java.util.Scanner;
public class FindWindChill{

	//Method for calculating WindChill
	public static double calculateWindChill(double temperature,double windSpeed){
		return (35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16));
	}
	
	public static void main(String args[]){
	
		//Taking input of the temperature and speed
		Scanner sc=new Scanner(System.in);
		double temperature=sc.nextDouble();
		double speed=sc.nextDouble();
		
		//Calling method for calculating WindChill and displaying it
		System.out.println("The wind chill temperature "+calculateWindChill(temperature,speed));
		
	}
}
