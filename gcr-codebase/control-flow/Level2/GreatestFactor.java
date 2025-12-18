import java.util.Scanner;

class GreatestFactor {

    public static void main(String args[]) {
	
	 // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Checking for positive integer and calculating greatest factor
        if (number>=1) {
            	int greatestFactor = 1;
            	for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;   
                }
		}
		System.out.println("Greatest factor of " + number + " is " + greatestFactor);
            
        }
        else {
		System.out.println("Please enter an integer greater than 1");
            }
            
        }
}
