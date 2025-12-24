import java.util.Scanner;
public class CheckPrimeNumber{

    //Method to check if the number is a prime or not
    public static boolean isPrime(int num){
       
	   if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args){
	
	    //Taking the user inputs
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
		
		//Calling method and then displaying the desired results
        if(isPrime(num)){
            System.out.println(num+" is a Prime Number");
        }else{
            System.out.println(num+" is not a Prime Number");
        }
    }
}