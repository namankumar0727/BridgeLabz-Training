import java.util.Scanner;

class CountDownUsingFor{
	
	public static void main(String args[]){
		
		//Taking input of the number for countdown
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();		
		
		//CountDown till 1
		for(int i=number;i>=1;i--){
			System.out.println(i);
		}
	}
}