import java.util.Scanner;
class NumberFormat{

	//Method to generate Exception
	static void generateException(String s){
		Integer.parseInt(s);
	}
	
	//Method to handle Exception
	static void handleException(String s){
		
		try{
			Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException handled");	
		}	
		catch(RuntimeException e){
			System.out.println("RuntimeException handled");	
		}
	}
	
	public static void main(String args[]){
		
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		
		//Calling method to generate and handle exception
		generateException(text);
		handleException(text);	
	}
}