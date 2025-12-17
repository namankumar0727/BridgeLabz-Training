class VolumeCalculator{

	public static void main(String args[]){

		//Radius in Kilometers
	
		double radius=6378;

		//Calculation of volume in cubic kilometers and cubic miles

		double volumeKilometers=(4/3)*Math.PI*radius*radius*radius;

		double volumeMiles=volumeKilometers/(1.6*1.6*1.6);

		System.out.println("The volume of earth in cubic kilometers is "+volumeKilometers+" and cubic miles is "+volumeMiles);
		
	}
	

}