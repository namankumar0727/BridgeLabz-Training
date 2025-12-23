public class NullPointerDemo{

	//Method to generate Exception
	public static void generateException(){
		String text=null;
		text.length();
	}
	
	//Method to handle Exception
	public static void handleException(){
		String text=null;
		try{
			text.length();
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException handled");
		}
	}
	
	public static void main(String args[]){
		
		//Calling Methods to generate and handle Exceptions
		generateException();	
		handleException();
	}
}
