import java.util.Scanner;

class HarshadNumber {
    public static void main(String args[]) {

        // Taking number input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();

        ///Checking if the number is a Harshad number or not
        int originalNumber=number;
        int sum=0;
        while(number>0) {
            int digit=number%10;  
            sum+=digit;         
            number=number/10;      
        }
        if(originalNumber%sum==0) {
            System.out.println(originalNumber+" is a Harshad Number");
        }
		else {
            System.out.println(originalNumber+" is not a Harshad Number");
        }
    }
}
