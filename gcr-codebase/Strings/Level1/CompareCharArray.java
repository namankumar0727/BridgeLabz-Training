import java.util.Scanner;
class CompareCharArray{
	
	//Method to get Chars
	static char[] getChars(String s){
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++){
			arr[i]=s.charAt(i);
		}
		return arr;
	}
	
	//Method to Compare Arrays
	static boolean compareArrays(char a[],char b[]){	
		if(a.length!=b.length){
			return false;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i]){
				return false;
			}		
		}
		return true;
	}

	public static void main(String args[]){
		
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		char arr1[]=getChars(text);
		char arr2[]=text.toCharArray();
		
		//Calling Methods to compare arrays
		boolean result=compareArrays(arr1,arr2);
		
		//Displaying the results
		System.out.println(result);
	
	}
}		
