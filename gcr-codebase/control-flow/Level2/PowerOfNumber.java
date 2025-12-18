import java.util.Scanner;

class PowerOfNumber{

    public static void main(String args[]) {
	
        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the power");
        int power = sc.nextInt();

        // Checking for positive integers and printing power
        if (number<= 0 || power<0) {
            System.out.println("Please enter positive numbers");
        }
        else {
            int ans = 1;
            for (int i=1;i<=power;i++) {
                ans=ans*number;
            }
            System.out.println(number + " having power " + power + " is " + ans);
        }
    }
}
