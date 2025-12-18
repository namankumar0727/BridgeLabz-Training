import java.util.Scanner;

class CalculateBonus{
	
	public static void main(String args[]){
		
		//Taking salary and years of service as input
		Scanner sc=new Scanner(System.in);
		double salary=sc.nextDouble();
		double yos=sc.nextDouble();

		//Checking if the bonus can be granted and calculating it		Boolean check=false;
		if(yos>5){
			double bonus=(5.0/100)*salary;
			System.out.println("Bonus Amount is "+bonus);
		}
		else{
			System.out.println("Bonus can't be granted");
		}
				
	}

}