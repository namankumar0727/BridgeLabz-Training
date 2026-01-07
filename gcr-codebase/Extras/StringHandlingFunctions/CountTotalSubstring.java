import java.util.Scanner;
public class CountTotalSubstring{
    
	public static void main(String[] args){
        //Taking user inputs
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string - ");
        String str=sc.nextLine();
        System.out.print("Enter substring - ");
        String sub=sc.nextLine();
		
		//Counting the substrings
        int count=0;
        for(int i=0;i<=str.length()-sub.length();i++){
            if(str.substring(i,i+sub.length()).equals(sub)){
                count++;
            }
        }
		
		//Displaying the desired results
        System.out.println("Substring occurs "+count+" times");
    }
}