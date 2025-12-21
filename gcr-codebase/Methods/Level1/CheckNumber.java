import java.util.Scanner;
class CheckNumber{

	//Method to check if the number is positive, negative or zero
	static int numberCheck(int n){
		if(n>0)return 1;
		if(n<0)return -1;
		return 0;
	}
	
	public static void main(String args[]){
		
		//Taking input of the number from the user
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//Calling method check
		System.out.println(numberCheck(n));
	}
}
