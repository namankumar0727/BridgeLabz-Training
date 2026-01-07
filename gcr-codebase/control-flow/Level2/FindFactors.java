import java.util.Scanner;

class FindFactors {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        // Taking user input of the number
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        // Checking if the number is a positive integer and then printing factors of it.
        if (number>=0) {
            for (int i=1;i<number;i++) {
                if(number%i==0){
                    System.out.println(i);
                }
            }
        } 
        else {
           System.out.println("Please enter a positive integer");
        }
    }
}
