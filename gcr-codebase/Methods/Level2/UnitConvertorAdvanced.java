class UnitConvertorAdvanced{
	
	//Method to convert Farhenheit To Celsius
	public static double convertFarhenheitToCelsius(double f){
		return (f-32)*5/9;	
	}
	
	//Method to convert Celsius To Farhenheit
	public static double convertCelsiusToFarhenheit(double c){
		return (c*9/5)+32;
	}

	//Method to convert Pounds To Kilograms
	public static double convertPoundsToKilograms(double p){
		return p*0.453592;
	}

	//Method to convert Kilograms ToPounds
	public static double convertKilogramsToPounds(double k){
		return k*2.20462;
	}
	
	//Method to convert Gallons To Liters
	public static double convertGallonsToLiters(double g){
		return g*3.78541;
	}
	
	//Method to convert Liters To Gallons
	public static double convertLitersToGallons(double l){
		return l*0.264172;	
	}
}