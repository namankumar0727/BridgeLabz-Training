import java.util.Scanner;
public class IsPalindromeString{
    public static void main(String[] args){
       
		//Taking inputs from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
        String str=sc.nextLine();
       
		//Checking if the string is palindrome or not and displaying the desired results
		String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("It is a palindrome String");
        }else{
            System.out.println("It's not a Palindrome String");
        }
    }
}