import java.util.Scanner;
public class GenerateFibonacci{
    
	//Method to print the fibonacci
    public static void printFibonacci(int n){
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        
		//Taking the user inputs
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
		
		//Calling method to printFibonacci
        printFibonacci(n);
    }
}