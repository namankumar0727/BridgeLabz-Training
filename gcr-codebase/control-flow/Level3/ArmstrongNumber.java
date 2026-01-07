import java.util.Scanner;

class ArmstrongNumber {

    public static void main(String args[]) {

        // Taking input of user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // Checking if the number is a armstrong number or not
        int sum=0;                    
        int originalNumber=number;       
        while(originalNumber>0){
            int digit=originalNumber%10;
            sum+=(digit*digit*digit);
            originalNumber=originalNumber/10;
        }
        if(sum==number){
            System.out.println(number+" is an Armstrong Number");
        }
		else {
            System.out.println(number+" is not an Armstrong Number");
        }
    }
}
