import java.util.Scanner;
public class CompareSplit{

	//Method to find Length
	public static int length(String s){
		int c=0;try{while(true){s.charAt(c++);}}catch(Exception e){}
			return c-1;
		}
	
	//Method to find word Length
	public static String[] split(String s){
		int len=length(s),count=1;
		for(int i=0;i<len;i++)if(s.charAt(i)==' ')count++;
		int space[]=new int[count+1];
		int k=1;
		for(int i=0;i<len;i++)if(s.charAt(i)==' ')space[k++]=i;
		space[k]=len;
		String words[]=new String[count];
		int start=0;
		for(int i=0;i<count;i++){
			String w="";
			for(int j=start;j<space[i+1];j++)w+=s.charAt(j);
				words[i]=w;
				start=space[i+1]+1;
			}
		return words;
		}
	
	
	//Method to compare
	public static boolean compare(String a[],String b[]){
		
		//Calling method
		if(a.length!=b.length)return false;
		for(int i=0;i<a.length;i++)if(!a[i].equals(b[i]))return false;
		return true;
		}
		
	public static void main(String args[]){
	
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		
		//Calling methods to split the strings
		String a[]=split(text);
		String b[]=text.split(" ");
		
		//Displaying results of compare method
		System.out.println(compare(a,b));
	}
}
