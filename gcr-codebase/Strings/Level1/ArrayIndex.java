import java.util.Scanner;
class ArrayIndex{
	
	//Method to generate exception
	static void generateException(String a[]){
		System.out.println(a[a.length]);
	}
	
	//Method to handle exception
	static void handleException(String a[]){
		try{
			System.out.println(a[a.length]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException handled");	
		}
		catch(RuntimeException e){
			System.out.println("RuntimeException handled");
		}
	}
	
	public static void main(String args[]){
	
	    //Taking input from the user for the three names
		Scanner sc=new Scanner(System.in);
		String names[]=new String[4];
		for(int i=0;i<4;i++){
			names[i]=sc.next();
		}
		
		//Calling methods to generate and handle Exceptions
		generateException(names);
		handleException(names);
	}
}