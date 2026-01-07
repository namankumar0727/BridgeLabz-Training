import java.util.Scanner;

class MultiplesWhileLoop{

    public static void main(String args[]) {

	// Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Checking if number is positive and less than 100 and printing multiples
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100");
        }
        else {
            int counter = 100;
            while (counter>=1) {
                if (counter%number==0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
    }
}
