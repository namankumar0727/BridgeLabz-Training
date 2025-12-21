import java.util.Scanner;
class TotalNaturalSum{

	//Method to calculate Sum
	static int totalSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String args[]){
	
		//Taking input of the number
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//Calling method for the sum and displaying it
		System.out.println("The total sum is "+totalSum(n));
	}
}