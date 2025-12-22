import java.util.Scanner;
class FindLengthString{
	
	//Method to find the length
	static int findLength(String s){
			int count=0;
			try{
				while(true){
					s.charAt(count);
					count++;
				}
			}
			catch(Exception e){}
		return count;
	}
	
	public static void main(String args[]){
	
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		
		//Calling methods and also displaying the desired results
		System.out.println(findLength(text));
		System.out.println(text.length());
	}
}
