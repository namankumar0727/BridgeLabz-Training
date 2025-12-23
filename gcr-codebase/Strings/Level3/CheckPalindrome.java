import java.util.Scanner;
public class CheckPalindrome{

    // Method to check palindrome using a loop
    public static boolean isPalindromeByLoop(String text){
        int start=0;
        int end=text.length()-1;
        
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    // Method to check palindrome using Recursion
    public static boolean isPalindromeByRecursion(String text,int start,int end){
        if(start>=end){
            return true;
        }
        if(text.charAt(start)!=text.charAt(end)){
            return false;
        }
        return isPalindromeByRecursion(text,start+1,end-1);
    }
    
    //Method to reverse string using charAt()
    public static char[] reverseString(String text){
        char reverse[]=new char[text.length()];
        int index=0;
        for(int i=text.length()-1;i>=0;i--){
            reverse[index]=text.charAt(i);
            index++;
        }
        return reverse;
    }
    
    //Check palindrome using character arrays
    public static boolean isPalindromeByArray(String text){
        char original[]=text.toCharArray();
        char reverse[]=reverseString(text);
        
        for(int i=0;i<original.length;i++){
            if(original[i]!=reverse[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
               
        //Taking user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //Calling Methods for palindrome check
        boolean result1=isPalindromeByLoop(text);
        boolean result2=isPalindromeByRecursion(text,0,text.length()-1);
        boolean result3=isPalindromeByArray(text);
        
        //Displaying results
        System.out.println("checking Palindrome using Loops"+result1);
        System.out.println("Checking Palindrome using Recursion - "+result2);
        System.out.println("checking Palindrome using Array - "+result3);
    }
}