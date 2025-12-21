class UnitConvertorLength{
	
	//Method to convert yards to feet
	public static double convertYardsToFeet(double yards){
		return (yards*3);
	}
	
	//Method to convert Feet to yards
	public static double convertFeetToYards(double feet){
		return feet*0.333333;
	}
	
	//Method to convert Meters to Inches
	public static double convertMetersToInches(double meters){
		return meters*39.3701;
	}
	
	//Method to convert Inches to Meters
	public static double convertInchesToMeters(double inches){
		return inches*0.0254;
	}
	
	//Method to convert Inches to CM
	public static double convertInchesToCm(double inches){
		return inches*2.54;
	}
}