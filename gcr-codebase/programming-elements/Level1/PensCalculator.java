class PensCalculator{
	
	public static void main(String args[]){
		//Total amount of pens=14;

		int pens=14;
	
		//Total number of people=3;

		int people=3;
	
		//Calculation to find number of pens per person and number of remaining pens

		int pensPerPerson=pens/people;
		int remainingPens=pens%people;

		System.out.println("The Pen Per Student is "+pensPerPerson+" and the remaining pen not distributed is "+remainingPens);
	
	}

}