import java.util.Scanner;
public class CompareUpperCase{
	
	//Method to convert to Upper	
	static String toUpper(String s){
		String r="";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='a'&&c<='z'){
				r+=(char)(c-32);
			}
		else{	
			r+=c;
		}
	}
	return r;
	}
	
	//Method to compare both strings
	public static boolean compare(String a,String b){
		if(a.length()!=b.length()){
			return false;
		}
		for(int i=0;i<a.length();i++)
			if(a.charAt(i)!=b.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
	
		//Taking inputs from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		
		//Method to convert upper case
		String u1=toUpper(text);
		String u2=text.toUpperCase();
		
		//Method to compare both strings
		System.out.println(compare(u1,u2));
	}
}
