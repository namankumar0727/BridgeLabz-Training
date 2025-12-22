import java.util.Scanner;
class StringIndex{

	//Method to generate Exception
	static void generateException(String s){
		s.charAt(s.length());
	}
	
	//Method to handle Exception
	static void handleException(String s){
		try{
			s.charAt(s.length());
	}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException handled");
		}
	}
	
	public static void main(String args[]){
		
		//Taking string input from the user 
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		
		//Calling methods to generate and handle Exceptions
		generateException(text);
		handleException(text);
	}
}