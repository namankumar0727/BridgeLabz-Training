import java.util.Scanner;
public class IllegalArgument{

	//Method to generate exception
	public static void generateException(String s){
		s.substring(5,2);
	}
	
	//Calling method to handle exception
	public static void handleException(String s){
		
		try{
			s.substring(5,2);
		}
		catch(IllegalArgumentException e){
			System.out.println("IllegalArgumentException handled");
		}
		catch(RuntimeException e){
			System.out.println("RuntimeException handled");	
		}
	
	}

	public static void main(String args[]){
	
		//Taking string inputs from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		
		//Calling method to generate Exception
		generateException(text);
		
		//Calling method to handle exception
		handleException(text);
	}
}
