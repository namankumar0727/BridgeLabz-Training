import java.util.*;

public class GuessTheNumber{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess a Number between 1-100");
		int generate=(int)(Math.random()*100);
		int count=1;
		do{
			System.out.println(6-count+" Attempts left");
			System.out.println("Enter a number");
			int number=sc.nextInt();
		    if(generate<number){
				System.out.println("Too High");
			}
			else if(generate>number){
				System.out.println("Too Low");
			}
			else{
				System.out.println("Congratulations!! You have won the guessing number challenge");
				return;
			}
			count++;
		}while(count<=5);
	}

}