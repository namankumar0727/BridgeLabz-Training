import java.util.Scanner;
public class CaculateGCDandLCM{
    
	//taking user input
    public static int takeInput(Scanner sc,String msg){
        System.out.print(msg);
        return sc.nextInt();
    }
    
	//Method to calculate gcd
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
	//Method to calculate lcm
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
   
   //Method to display result
    public static void displayResult(int a,int b,int g,int l){
        System.out.println("GCD of "+a+" and "+b+" is: "+g);
        System.out.println("LCM of "+a+" and "+b+" is: "+l);
    }
    public static void main(String[] args){
		
		//Taking the user inputs
        Scanner sc=new Scanner(System.in);
        int a=takeInput(sc,"Enter first number: ");
        int b=takeInput(sc,"Enter second number: ");
		
		//Calling method to find GCD and LCM and for displaying the result
        int g=gcd(a,b);
        int l=lcm(a,b);
        displayResult(a,b,g,l);
    }
}