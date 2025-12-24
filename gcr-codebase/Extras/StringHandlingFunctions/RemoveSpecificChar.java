import java.util.Scanner;
public class RemoveSpecificChar{
    public static void main(String[] args){
	
	    //Taking input from the user 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.print("Enter character to remove: ");
        char remove=sc.next().charAt(0);      
		String result="";
		
        //Removing specific characters
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=remove){
                result=result+str.charAt(i);
            }
        }
		
		//Displaying the desired results
        System.out.println("Modified String: \""+result+"\"");
    }
}