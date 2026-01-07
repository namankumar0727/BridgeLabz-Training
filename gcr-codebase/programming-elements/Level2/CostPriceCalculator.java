import java.util.Scanner;

class CostPriceCalculator{

	public static void main(String args[]){
		
		//Taking input of unit price and quantity
		Scanner sc=new Scanner(System.in);
		int unitPrice=sc.nextInt();
		int quantity=sc.nextInt();

		//Calculation of total Price
		int totalPrice=unitPrice*quantity;
		
		//Printing the Total Price
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}

}