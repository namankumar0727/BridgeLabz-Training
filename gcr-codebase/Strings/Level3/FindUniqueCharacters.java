import java.util.Scanner;
public class FindUniqueCharacters{
	
	//Method to find the length of the string
	public static int length(String s){
		int c=0;try{while(true){s.charAt(c++);}}catch(Exception e){}
		return c-1;
	}
	
	//Method to find the unique characters
	public static char[] uniqueChars(String s){
		int len=length(s);
		char temp[]=new char[len];
		int k=0;
		for(int i=0;i<len;i++){
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
		for(int i=0;i<k;i++){
			result[i]=temp[i];
		}
		return result;
	}
		
	public static void main(String args[]){
		
		//Taking input of the user
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		
		//Calling method to find unique characters
		char u[]=uniqueChars(text);
		
		//Print the desired results
		for(int i=0;i<u.length;i++)
			System.out.print(u[i]+" ");
		}
	}