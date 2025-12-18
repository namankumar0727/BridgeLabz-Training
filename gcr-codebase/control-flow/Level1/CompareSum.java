import java.util.Scanner;

class CompareSum{
	
	public static void main(String args[]){
		
		//Taking input of the number
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		//Checking if the number is natural of not	
		Boolean check=false;
		if(num>0) check=true;		
		
		//Calculating sum of the n natural numbers and comparing it with while loop one
		if(check==true){
			int sum=num*(num+1)/2;
			int whileSum=0;
			while(num>0){
				whileSum+=num;
				num--;
			}
			if(sum==whileSum){
				System.out.println("Sum is equal "+sum);
			}
			else{
				System.out.println("Sum is not equal");
			}
		}
		else{
			System.out.println("The number "+num+" is not a natural number");	
		}	
				
	}


}