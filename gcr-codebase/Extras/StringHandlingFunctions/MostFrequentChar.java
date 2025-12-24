import java.util.Scanner;
public class MostFrequentChar{
    public static void main(String[] args){
	
	    //Taking the user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string - ");
        String str=sc.nextLine();
        int maxCount=0;
        char maxChar=' ';
		
        //Find the most frequent character
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                maxChar=str.charAt(i);
            }
        }
		
		//Diplaying the desired results
        System.out.println("Most Frequent Character: '"+maxChar+"'");
    }
}