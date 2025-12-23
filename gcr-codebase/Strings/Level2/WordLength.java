import java.util.Scanner;
public class WordLength{

	//Method for length
	public static int len(String s){
		int c=0;try{while(true){s.charAt(c++);}}catch(Exception e){}
		return c-1;
	}
	
	//Method for word length
	public static String[][] wordLength(String words[]){
		String r[][]=new String[words.length][2];
		for(int i=0;i<words.length;i++){
			r[i][0]=words[i];
			r[i][1]=String.valueOf(len(words[i]));
		}
	return r;
	}
	public static void main(String args[]){
	
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String w[]=text.split(" ");
		String r[][]=wordLength(w);
		
		//Displaying desired output
		for(int i=0;i<r.length;i++)
		System.out.println(r[i][0]+" "+Integer.parseInt(r[i][1]));
	}
}
