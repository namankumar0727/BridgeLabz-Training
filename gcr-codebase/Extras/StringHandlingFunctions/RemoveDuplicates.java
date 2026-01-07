import java.util.Scanner;
public class RemoveDuplicates{
    
	public static void main(String[] args){
	
       //Taking inputs from the user 
	   Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String result="";
		
        //Removing duplicate characters
        for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
            if(result.indexOf(ch)==-1){
                result=result+ch;
            }
        }
		
		//Displaying the desired results
        System.out.println("The desired string after removal of duplicates "+result);
    }
}