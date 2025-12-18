import java.util.Scanner;

class FindFactors {

    public static void main(String args[]) {

        // Taking user input of the number	
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
        int number = sc.nextInt();

        // Checking if the number is a positive integer and then printing factors
        if (number>0) {
            int i=1;   
            while (i<number) {
                if (number%i==0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        else {
            System.out.println("Please enter a positive integer");
        }
    }
}
