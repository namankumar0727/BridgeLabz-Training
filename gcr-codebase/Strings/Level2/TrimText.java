import java.util.Scanner;
class TrimText{

	//Method to trim Index
	static int[] trimIndex(String s){
		int i=0,j=s.length()-1;
		while(s.charAt(i)==' ')
			i++;
		while(s.charAt(j)==' ')
			j--;
		return new int[]{i,j+1};
	}
	
	//Method to get substring
	static String sub(String s,int a,int b){
		String r="";
		for(int i=a;i<b;i++)
			r+=s.charAt(i);
		return r;
	}
	
	//Method for comparison
	static boolean compare(String a,String b){
		if(a.length()!=b.length())return false;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!=b.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String t=sc.nextLine();
		int idx[]=trimIndex(t);
		String a=sub(t,idx[0],idx[1]);
		String b=t.trim();
		
		//Displaying desired outputs
		System.out.println(compare(a,b));
	}
}