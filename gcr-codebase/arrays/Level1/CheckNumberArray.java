import java.util.Scanner;

public class CheckNumberArray{

    public static void main(String[] args) {

		// Taking the user input in the array
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
		
		//Checking if the number is positive or negative and also even or odd then comparing it..
        for (int i=0;i<a.length; i++) {
            if (a[i]>0) {
                System.out.print(a[i]+" is Positive and ");
                if (a[i]%2==0){
                    System.out.println("Even");
                } 
				else {
                    System.out.println("Odd");
                }

            } 
			else if (a[i] < 0) {
                System.out.println(a[i]+ " is Negative");
            }
			else{
                System.out.println(a[i]+ " is Zero");
            }
        }
        int first = a[0];
        int last = a[a.length - 1];
        System.out.println("Comparison of first and last elements");
        if (first==last){
            System.out.println("First and Last elements are Equal");
        }
		else if(first>last) {
            System.out.println("First element is greater than Last element");
        }
		else {
            System.out.println("First element is lesser than Last element");
        }
    }
}
