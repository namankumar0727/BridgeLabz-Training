import java.util.Scanner;
public class CompareLowerCase{
	
	//Method to convert to lower Strings
	public static String toLower(String s){
		String r="";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='A'&&c<='Z'){
				r+=(char)(c+32);
			}
			else{
				r+=c;
			}
		}
		return r;
	}
	
	//Method to Compare Two Strings
	public static boolean compare(String a,String b){
	
		if(a.length()!=b.length())return false;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!=b.charAt(i)){
				return false;
			}
			return true;
		}
		
		public static void main(String args[]){

			//Taking input from the user
			Scanner sc=new Scanner(System.in);
			String text=sc.nextLine();
			
			//Method to convert to lowerCase
			String l1=toLower(text);
			String l2=text.toLowerCase();
			
			//Method to Compare both strings
			System.out.println(compare(l1,l2));
		}
}
