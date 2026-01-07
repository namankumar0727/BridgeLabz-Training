import java.util.Scanner;
public class CountVowels{
	
	//Method for the string type
	public static String type(char c){
		if(c>='A'&&c<='Z'){
			c=(char)(c+32);
		}
		if(c>='a'&&c<='z'){
			if("aeiou".indexOf(c)>=0)
			{
				return "Vowel";
			}
		return "Consonant";
		}
	return "Not";
	}
	
	//Method to count
	public static int[] count(String s){
		int v=0,c=0;
		for(int i=0;i<s.length();i++){
			String t=type(s.charAt(i));
			if(t.equals("Vowel"))v++;
			if(t.equals("Consonant"))c++;
		}
		return new int[]{v,c};
	}
	
	public static void main(String args[]){
		
		//Taking the user input as String
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		//Calling method Count
		int r[]=count(s);
		
		//Displaying the desired results
		System.out.println(r[0]+" "+r[1]);
	}
}
