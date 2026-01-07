import java.util.Scanner;

class PrintMultiplicationTable{
	
	public static void main(String args[]){
		
		//Taking input of the number
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		//Print Multiplication Table of the number 
		for(int i=6;i<=9;i++){
			System.out.println(num+" * "+i+" = "+num*i);
		}
				
	}


}