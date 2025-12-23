import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String args[]){
	
	//Taking input of a number and calculating multiplcation table
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int table[]=new int[10];
	for(int i=1;i<=10;i++){
		table[i-1]=num*i;
	}
	
	//Displaying multiplication table
	for(int i=1;i<=10;i++){
		System.out.println(num+" * "+i+" = "+table[i-1]);
	}
	}
}
