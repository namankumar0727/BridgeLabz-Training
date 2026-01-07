import java.util.Scanner;
public class FindUniqueFrequency{
	
	//Method to find the unique Character
	public static char[] uniqueCharacters(String s){
		char temp[]=new char[s.length()];
		int k=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			boolean unique=true;
			for(int j=0;j<i;j++){
				if(s.charAt(j)==c){
					unique=false;
					break;
				}
			}
			if(unique){
				temp[k++]=c;
			}
		}
		char result[]=new char[k];
		for(int i=0;i<k;i++)result[i]=temp[i];
			return result;
	}
	
	public static String[][] frequency(String s){
	
		//Frequency of the string
		int freq[]=new int[256];
		for(int i=0;i<s.length();i++){
			freq[s.charAt(i)]++;
		}
		
		//Calling method to unique characters
		char u[]=uniqueCharacters(s);
		String result[][]=new String[u.length][2];
		for(int i=0;i<u.length;i++){
			result[i][0]=String.valueOf(u[i]);
			result[i][1]=String.valueOf(freq[u[i]]);
		}
		return result;
	}
	
	public static void main(String args[]){
	
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		
		//Calling method frequency
		String res[][]=frequency(text);
		
		//Displaying desired results
		for(int i=0;i<res.length;i++){
			System.out.println(res[i][0]+" "+res[i][1]);
		}
	}
}
