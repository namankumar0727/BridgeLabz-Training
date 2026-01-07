import java.util.Scanner;
public class EvenOddArray{
public static void main(String args[]){

	//Taking input of number
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if(number<=0){
		System.out.println("error");
		return;
	}
	
	//Implementing odd and even arrays
	int odd[]=new int[number/2+1];
	int even[]=new int[number/2+1];
	int oddIndex=0;
	int evenIndex=0;
	for(int i=1;i<=number;i++){
	if(i%2==0){
		even[evenIndex]=i;
		evenIndex++;
	}
	else{
		odd[oddIndex]=i;
		oddIndex++;
	}
	}
	
	//Displaying the odd and even arrays
	System.out.println("Odd Array");
	for(int i=0;i<oddIndex;i++){
		System.out.println(odd[i]);
	}
	System.out.println("Even Array");
	for(int i=0;i<evenIndex;i++){
		System.out.println(even[i]);
	}
	}
}
