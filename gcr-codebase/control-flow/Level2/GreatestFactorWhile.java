import java.util.Scanner;

class GreatestFactorWhile{

    public static void main(String args[]) {
	
	 // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        // Checking for positive integer and calculating greatest factor
        if (number>=1) {
		int greatestFactor=0;
            	int i=number-1;
	        while (i>=1){
                if (number%i==0) {
                    greatestFactor=i;
                    break; 
                }
                i--;
		}
		System.out.println("Greatest factor of "+number+" is "+greatestFactor);
            
        }
        else {
		System.out.println("Please enter an integer greater than 1");
            }
            
        }
}
