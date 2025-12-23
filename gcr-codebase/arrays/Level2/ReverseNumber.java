import java.util.Scanner;
public class ReverseNumber{
public static void main(String args[]){
	
	//Taking input of number
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();

	//Reversing and storing in array
	int temp=number;
	int count=0;
	while(temp!=0){
		count++;
		temp=temp/10;
	}
	int digits[]=new int[count];
	temp=number;
	for(int i=count-1;i>=0;i--){
		digits[i]=temp%10;
		temp=temp/10;
	}
	//Displaying the reverse number
	for(int i=0;i<count;i++){
		System.out.print(digits[i]);
	}
	}
}
