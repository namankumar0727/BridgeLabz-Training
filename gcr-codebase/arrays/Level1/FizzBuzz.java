import java.util.Scanner;
class FizzBuzz{
	public static void main(String args[]){
	
	//Taking the user input in number
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if(number<0){
		System.out.println("Error");
		return;
	}
	
	//Implmenting the method 
	String ans[]=new String[number];
	for(int i=0;i<=number;i++){
		if(i%3==0 && i%5==0){
			ans[i-1]="FizzBuzz";
		}
		else if(i%3==0){
			ans[i-1]="Fizz";
		}
		else if(i%5==0){
			ans[i-1]="Buzz";
		}
		else{
			ans[i-1]=String.valueOf(i);
		}
	}
	
	//Displaying the result
	for(int i=0;i<ans.length;i++){
		System.out.println("At "+(i+1)+" -> "+ans[i]);
	}
	}
}
