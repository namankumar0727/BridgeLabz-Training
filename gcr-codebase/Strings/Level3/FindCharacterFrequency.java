import java.util.Scanner;
public class FindCharacterFrequency{

    //Method to find frequency of the character
    public static String[][] findCharacterFrequency(String text){
        int freq[]=new int[256]; 
        
        //Count frequency of each character
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }
        
        //Count Unique Characters
        int count=0;
        for(int i=0;i<text.length();i++){
            if(freq[text.charAt(i)]>0){
                count++;
                freq[text.charAt(i)]=-freq[text.charAt(i)];
            }
        }
        
        //Reset and recount for storing
        freq=new int[256];
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }
        
        //Store characters and frequencies
        String result[][]=new String[count][2];
        int index=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(freq[ch]>0){
                result[index][0]=String.valueOf(ch);
                result[index][1]=String.valueOf(freq[ch]);
                index++;
                freq[ch]=0; //avoid duplicates
            }
        }
        return result;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //Calling method findCharacterFrequency 
        String result[][]=findCharacterFrequency(text);
        
        //Displaying result
        System.out.println("Character Frequency");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"  "+result[i][1]);
        }
    }
} 