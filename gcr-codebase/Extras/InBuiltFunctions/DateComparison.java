import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison{
    public static void main(String[] args){
	
	    //Taking input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate d1=LocalDate.parse(sc.nextLine());
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate d2=LocalDate.parse(sc.nextLine());
       
	   //Comparing and Displaying the output
        if(d1.isBefore(d2)){
            System.out.println("First date is before second date");
        }
		else if(d1.isAfter(d2)){
            System.out.println("First date is after second date");
        }
		else if(d1.isEqual(d2)){
		    System.out.println("Both dates are same");
        }
    }
}