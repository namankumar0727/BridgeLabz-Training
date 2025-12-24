import java.util.Scanner;
public class MaxOfThree{

    //Taking input from the user
    public static int takeInput(Scanner sc,String msg){
        System.out.print(msg);
        return sc.nextInt();
    }
	
    //find maximum
    public static int findMax(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    public static void main(String[] args){
		
		//Taking input from the user
        Scanner sc=new Scanner(System.in);
        int a=takeInput(sc,"Enter first number: ");
        int b=takeInput(sc,"Enter second number: ");
        int c=takeInput(sc,"Enter third number: ");
		
		//Calling method to find Max
        int max=findMax(a,b,c);
		
		//Display maximum Number
        System.out.println("Maximum number is: "+max);
    }
}