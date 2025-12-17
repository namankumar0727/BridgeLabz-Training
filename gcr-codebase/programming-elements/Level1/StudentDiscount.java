import java.util.Scanner;

class StudentDiscount{
	
	public static void main(String args[]){
		
		// Taking inputs of Fee amount and Percentage
		Scanner sc=new Scanner(System.in);		
		double fee=sc.nextInt();
		double discount=sc.nextInt();

		// Calculation to find Discounted amount and discounted price the student will pay for the course
		double discountAmount=((discount)/100)*fee;
		double finalDiscountedFee=fee-discountAmount;

		//Printing of Discount amount and final Discount amount			
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalDiscountedFee);

		
	}
	
}