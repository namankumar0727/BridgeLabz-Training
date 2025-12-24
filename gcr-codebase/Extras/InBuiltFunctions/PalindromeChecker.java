import java.util.Scanner;
public class PalindromeChecker{
    
	//Take input from the user
    public static String takeInput(Scanner sc){
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
	
    //checking Palindrome
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
	
    //Displaying result
    public static void displayResult(String str,boolean result){
        if(result){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
    public static void main(String[] args){
	    
		//Creating Scanner class, object and taking user inputs
        Scanner sc=new Scanner(System.in);
        String str=takeInput(sc);
        boolean result=isPalindrome(str);
		
		//Displaying the desired result
        displayResult(str,result);
    }
}