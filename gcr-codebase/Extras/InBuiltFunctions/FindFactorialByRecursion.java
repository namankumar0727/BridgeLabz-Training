import java.util.Scanner;
public class FindFactorialByRecursion{
   
   //Taking inputs from the user
    public static int takeInput(Scanner sc){
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    
	//Calculate the factorial of the number
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
   
   //Displaying the result
    public static void displayResult(int n,int fact){
        System.out.println("Factorial of "+n+" is: "+fact);
    }
	
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=takeInput(sc);
        int fact=factorial(n);
        displayResult(n,fact);
    }
}