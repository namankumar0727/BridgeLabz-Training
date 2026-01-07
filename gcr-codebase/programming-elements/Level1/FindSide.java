import java.util.Scanner;

class FindSide{
	
	public static void main(String args[]){
		
		//Taking input of Perimeter of Square
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the perimeter of Square");
		int perimeter=sc.nextInt();
		
		//Calculating the side of the square
		int side=perimeter/4;
		
		//Printing the side of the square
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);	
	
	}
}