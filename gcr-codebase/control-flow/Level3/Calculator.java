import java.util.Scanner;

class Calculator{

    public static void main(String[] args) {

		// Taking input values from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double first=sc.nextDouble();
        System.out.println("Enter second number:");
        double second=sc.nextDouble();
        System.out.println("Enter operator +, -, *, /");
        String operator=sc.next();

        // calculating the operation using switch case
        switch(operator) {
            case "+":
                System.out.println("ANS - "+(first+second));
                break;

            case "-":
                System.out.println("ANS - "+(first-second));
                break;

            case "*":
                System.out.println("ANS - "+(first*second));
                break;

            case "/":
                System.out.println("ANS - "+(first/second));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
