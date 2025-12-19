import java.util.Scanner;
class MultiplicationTableSpecific{
	public static void main(String args[]){
	
	//Taking input of the number and calculating the multiplication Table
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int table[]=new int[4];
	int index=0;
	for(int i=6;i<=9;i++){
		table[index]=num*i;
		index++;
	}
	index=0;
	
	//Displaying multiplication table of the number
	for(int i=6;i<=9;i++){
		System.out.println(num+" * "+i+" = "+table[index]);
		index++;
	}
	}
}
