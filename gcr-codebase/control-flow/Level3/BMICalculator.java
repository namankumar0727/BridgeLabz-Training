import java.util.Scanner;

class BMICalculator {

    public static void main(String args[]) {

        // Taking input of weight and height from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg:");
        double weight=sc.nextDouble();
        System.out.println("Enter height in cm:");
        double heightCm=sc.nextDouble();

        // Convert height from cm to meters and calculating BMI of the person
        double heightMeter=heightCm/100;
        double bmi=weight/(heightMeter*heightMeter);
        if(bmi<18.5) {
            System.out.println("Weight Status - Underweight");
        }
		else if(bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status - Normal weight");
        }
		else if(bmi >= 25 && bmi < 40) {
            System.out.println("Weight Status - Overweight");
        }
		else{
            System.out.println("Weight Status - Obese");
        }
    }
}
