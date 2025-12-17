class FindDiscount{
	
	public static void main(String args[]){
		
		// Fee amount

		double fee=125000;
	
		// Discount Percentage
		
		double discount=10;

		// Calculation to find Discounted amount and discounted price the student will pay for the course

		double discountAmount=((discount)/100)*fee;
		
		double finalDiscountedFee=fee-discountAmount;
			
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalDiscountedFee);

		
	}
	
}