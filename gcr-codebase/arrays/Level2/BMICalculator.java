import java.util.Scanner;
	class BMICalculator{
	public static void main(String args[]){
	
	//Taking weight and height
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	double weight[]=new double[n];
	double height[]=new double[n];
	double bmi[]=new double[n];
	String status[]=new String[n];
	for(int i=0;i<n;i++){
		weight[i]=sc.nextDouble();
		height[i]=sc.nextDouble();
	}
	
	//Calculating bmi for person
	for(int i=0;i<n;i++){
		bmi[i]=weight[i]/(height[i]*height[i]);
		if(bmi[i]<18.5){
			status[i]="Underweight";
		}
		else if(bmi[i]<25){
			status[i]="Normal";
		}
		else if(bmi[i]<40){
			status[i]="Overweight";
		}
		else{
			status[i]="Obese";
		}
	}
	
	//Displaying BMI
	for(int i=0;i<n;i++){
		System.out.println("BMI "+bmi[i]+" "+status[i]);
	}
	}
}
