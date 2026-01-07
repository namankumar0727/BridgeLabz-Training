import java.util.Scanner;

class MaximumHandshakes{

    public static void main(String args[]) {

        // Taking input for number of students
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();

        // Calculating maximum number of handshakes
        int handshakes=(students*(students-1))/2;

        // Printing the desired results
        System.out.println("Maximum number of handshakes " +handshakes);
    }
}
