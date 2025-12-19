import java.util.Scanner;

class CheckAbundantNumber{
	
    public static void main(String args[]) {
	
        // Taking number input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
		
        //Checking if the number is a abundant number or not
        int sum=0;
        for(int i=1;i<number;i++) {
            if(number%i==0) {
                sum+=i;
            }
        }
        if(sum>number) {
            System.out.println(number+" is a Abundant Number");
        }
		else{
            System.out.println(number" is not an Abundant Number");
        }
    }
}
