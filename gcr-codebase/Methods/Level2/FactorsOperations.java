import java.util.Scanner;
public class FactorsOperations{

    //method to Find the factors
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
    
    //method to find the greatest factor
    public static int greatestFactor(int factors[]){
        int max=factors[0];
        for(int i=1;i<factors.length;i++){
            if(factors[i]>max){
                max=factors[i];
            }
        }
        return max;
    }
    
    //method to find the sum of factors
    public static int sumOfFactors(int factors[]){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum=sum+factors[i];
        }
        return sum;
    }
    
    //method to find product of factors
    public static int productOfFactors(int factors[]){
        int product=1;
        for(int i=0;i<factors.length;i++){
            product=product*factors[i];
        }
        return product;
    }
    
    //method to find product of cube of factors
    public static double productOfCubeOfFactors(int factors[]){
        double product=1;
        for(int i=0;i<factors.length;i++){
            product=product*Math.pow(factors[i],3);
        }
        return product;
    }

    public static void main(String[]args){
        
		
		//Taking user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
		
		//Calling method findFactors
        int factors[]=findFactors(number);
		
		//Displaying factors to display factors
        System.out.print("Factors ");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+" ");
        }
        System.out.println();
        System.out.println("Greatest Factor "+greatestFactor(factors));
        System.out.println("Sum of Factors "+sumOfFactors(factors));
        System.out.println("Product of Factors "+productOfFactors(factors));
        System.out.println("Product of Cube of Factors "+productOfCubeOfFactors(factors));
    }
}