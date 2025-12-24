import java.util.Scanner;
public class FindLongestWord{
    
	public static void main(String[] args){
        
		//Taking inputs from the user 	
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence=sc.nextLine();
		
		//Splitting the string and finding the longest word
        String[] words=sentence.split(" ");
        String longest="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
        }
		
		//Displaying the desired results
        System.out.println("Longest word - "+longest);
    }
}