import java.util.Scanner;
class OperationsOnFactors{

	//Method to count Factors and make factor array
	public static int[] findFactors(int number){
	int count=0;
	for(int i=1;i<=number;i++){
		if(number%i==0){
			count++;
		}
	}
	int factors[]=new int[count];
	int index=0;
	for(int i=1;i<=number;i++){
		if(number%i==0){
			factors[index]=i;
			index++;
		}
	}
	return factors;
	}
	
	//Method to find sum of factors
	public static int findSum(int factors[]){
		int sum=0;
		for(int i=0;i<factors.length;i++){
			sum+=factors[i];
		}
		return sum;
	}
	
	//Method to find product 
	public static int findProduct(int factors[]){
		int product=1;
		for(int i=0;i<factors.length;i++){
			product*=factors[i];
		}
	return product;
	}
	
	//Method to find  sum of squares
	public static double findSumOfSquares(int factors[]){
		double sum=0;
		for(int i=0;i<factors.length;i++){
			sum+=Math.pow(factors[i],2);
		}
	return sum;
	}

	public static void main(String args[]){
	
		//Taking input of the number from the user
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		//Calling method findFactors to find factors
		int factors[]=findFactors(number);
		for(int i=0;i<factors.length;i++){
			System.out.println(factors[i]+" ");
		}
		
		//Printing and calling the methods
		System.out.println("The sum of factors is "+findSum(factors));
		System.out.println("The sum of squares of factors is "+findSumOfSquares(factors));	
		System.out.println("The product of factors is "+findProduct(factors));
	}
}
















