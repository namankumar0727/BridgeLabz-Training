import java.util.Scanner;

class CheckPrime{
    public static void main(String args[]) {
	
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        // Checking if the number is prime or not
        boolean isPrime = true;
        if(num<=1) {
            isPrime=false;
        } 
		else{
            for(int i=2;i<num;i++) {
                if (num%i==0){
                    isPrime = false;
                    break; 
                }
            }
        }
        if (isPrime) {
            System.out.println(num+" is a Prime Number");
        } else {
            System.out.println(num+" is not a Prime Number");
        }
    }
}
