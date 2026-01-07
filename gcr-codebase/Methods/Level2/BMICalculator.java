import java.util.Scanner;
public class BMICalculator{

    //Method to calculate BMI and store in array
    public static void calculateBMI(double data[][]){
        for(int i=0;i<data.length;i++){
            double heightInMeter=data[i][1]/100;
            data[i][2]=data[i][0]/(heightInMeter*heightInMeter);
        }
    } 
	
    //Method to find BMI status
    public static String[] findBMIStatus(double data[][]){
        String status[]=new String[data.length];
        
        for(int i=0;i<data.length;i++){
            double bmi=data[i][2];
            
            if(bmi<=18.4){
                status[i]="Underweight";
            }else if(bmi>=18.5 && bmi<=24.9){
                status[i]="Normal";
            }else if(bmi>=25.0 && bmi <=39.9){
                status[i]="Overweight";
            }else{
                status[i]="Obese";
            }
        }
        return status;
    }

    public static void main(String[]args){
        
        //Taking inputs from the user
        Scanner sc=new Scanner(System.in);
        double personData[][]=new double[10][3];
        for(int i=0;i<10;i++){
            System.out.print("Enter weight of person "+(i+1)+" (kg): ");
            personData[i][0]=sc.nextDouble();
            System.out.print("Enter height of person "+(i+1)+" (cm): ");
            personData[i][1]=sc.nextDouble();
        }
        
        //calculating BMI
        calculateBMI(personData);
        
        //Calling method to Find BMI status
        String status[]=findBMIStatus(personData);
        
        //Display result
        System.out.println("Weight  Height  BMI  Status");
        for(int i=0;i<10;i++){
            System.out.println(personData[i][0]+"  "+personData[i][1]+"  "+personData[i][2]+"  "+status[i]);
        }
    }
}