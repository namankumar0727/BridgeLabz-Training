import java.util.Scanner;

class CountNumber {

    public static void main(String args[]) {

        // Taking input of user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // Counting Numbers
        int counter=0;                  
        while(number>0){
			number/=10;
			counter++;
        }
        System.out.println("The total numbers are "+counter);
        }
    }
