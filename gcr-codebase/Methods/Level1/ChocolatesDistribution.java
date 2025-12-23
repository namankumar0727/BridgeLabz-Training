import java.util.Scanner;
public class ChocolatesDistribution{
	
	//Method for calculating chocolate distribution
	public static int[] findDistribution(int chocolates,int children){
		int each=chocolates/children;
		int remaining=chocolates%children;
		return new int[]{each,remaining};
	}
	
	public static void main(String args[]){
		
		//Taking input from the user for chocolates and children
		Scanner sc=new Scanner(System.in);
		int chocolates=sc.nextInt();
		int children=sc.nextInt();
		
		//Calling method findDistribution for calculating
		int result[]=findDistribution(chocolates,children);
		
		//Printing the number of chocolates each get and remaining chocolates as well
		System.out.println("Each will get "+result[0]);
		System.out.println("Remaining Chocolates "+result[1]);
	}
}

