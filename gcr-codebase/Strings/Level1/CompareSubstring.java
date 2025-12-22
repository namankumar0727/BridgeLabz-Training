import java.util.Scanner;
class CompareSubstring{
	
	//Method to make a substring using CharAt
	static String subStringUsingCharAt(String s,int start,int end){
		String result="";
		for(int i=start;i<end;i++){
			result+=s.charAt(i);
		}
		return result;
	}
	
	//Method to compare using Char At
	static boolean compareUsingCharAt(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		//Calling methods
		String sub1=subStringUsingCharAt(text,start,end);
		String sub2=text.substring(start,end);
		boolean result=compareUsingCharAt(sub1,sub2);
		
		Displaying result
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(result);
	}
}

