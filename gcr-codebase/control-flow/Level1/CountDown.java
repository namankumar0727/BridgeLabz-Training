import java.util.Scanner;

class CountDown{
	
	public static void main(String args[]){
		
		//Taking input of the number for countdown
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();		
		
		//CountDown till 1
		while(number>=1){
			System.out.println(number);
			number--;
		}
	}
}