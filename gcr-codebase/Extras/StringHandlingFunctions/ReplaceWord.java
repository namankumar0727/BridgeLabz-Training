import java.util.Scanner;
public class ReplaceWord{
    public static void main(String[] args){
	
		//Taking user inputs
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence - ");
        String sentence=sc.nextLine();
        System.out.print("Enter word to replace - ");
        String oldWord=sc.nextLine();
        System.out.print("Enter new word - ");
        String newWord=sc.nextLine();
        String result="";
		
		//Splitting the string and replacing the words
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].equals(oldWord)){
                result=result+newWord;
            }else{
                result=result+words[i];
            }
            if(i<words.length-1){
                result=result+" ";
            }
        }
		
		//Displaying the results
        System.out.println(result);
    }
}