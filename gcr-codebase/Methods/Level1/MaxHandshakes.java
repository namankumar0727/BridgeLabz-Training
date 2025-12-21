import java.util.Scanner;
class MaxHandshakes{

	//Method to calculate Handshakes
	static int calculateHandshakes(int n){
		return (n*(n-1))/2;
	}
	
	public static void main(String args[]){
	
		//Taking input of total Number Of Students
		Scanner sc=new Scanner(System.in);
		int numberOfStudents=sc.nextInt();
		
		//Calling method calculateHandshakes
		int result=calculateHandshakes(numberOfStudents);
		
		//Displaying the number of possible handshakes
		System.out.println("The number of possible handshakes are "+result);
	}
}

