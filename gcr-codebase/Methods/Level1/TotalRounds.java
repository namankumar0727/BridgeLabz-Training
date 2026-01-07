import java.util.Scanner;
public class TotalRounds{

	//Method to calculate Rounds
	public static int calculateTotalRounds(int a,int b,int c){
		int perimeter=a+b+c;
		return 5000/perimeter;
	}
	
	public static void main(String args[]){
	
	//Taking input of sides of triangle
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	//Calling method calculateTotalRounds
	int rounds=calculateTotalRounds(a,b,c);
	
	//Displaying the Total Number of Rounds
	System.out.println("Total number of rounds are "+rounds);
	}
}

