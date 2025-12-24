import java.util.Scanner;
public class ConvertTemperature{
    
	//Method to convert Fahrenheit To Celsius
    public static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
   
   //Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
    
	//Taking the inputs from the user
    public static double takeInput(Scanner sc,String msg){
        System.out.print(msg);
        return sc.nextDouble();
    }
    public static void main(String[] args){
		
		//Taking inputs from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Fahrenheit to Celsius");
        System.out.println("2-Celsius to Fahrenheit");
        System.out.print("Choose one -");
        int choice=sc.nextInt();
        if(choice==1){
            double f=takeInput(sc,"Enter temperature in Fahrenheit: ");
            double c=fahrenheitToCelsius(f);
            System.out.println("Celsius - "+c);
        }
		else if(choice==2){
            double c=takeInput(sc,"Enter temperature in Celsius: ");
            double f=celsiusToFahrenheit(c);
            System.out.println("Fahrenheit - "+f);
        }
		else{
            System.out.println("The choice is Invalid");
        }
    }
}