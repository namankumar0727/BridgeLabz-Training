import java.util.Scanner;
public class FirstNonRepeatingCharacter{

    //Method to find first non repeating character using charAt()
    public static char findFirstNonRepeatingChar(String text){
        int freq[]=new int[256];
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }
        for(int i=0;i<text.length();i++){
            if(freq[text.charAt(i)]==1){
                return text.charAt(i);
            }
        }
        return '\0'; 
    }

    public static void main(String[]args){
        
        //Taking input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //Calling method to find First Non Repeating Char
        char result=findFirstNonRepeatingChar(text);
        
        //Display result
        if(result!='\0'){
            System.out.println("First non-repeating character: "+result);
        }else{
            System.out.println("No non-repeating character found");
        }
    }
}