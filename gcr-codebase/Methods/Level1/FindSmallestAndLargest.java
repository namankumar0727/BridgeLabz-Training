import java.util.Scanner;
public class FindSmallestAndLargest{

    public static void main(String[]args){
        
        //Taking user inputs for the three Numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 Numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        //Calling method findSmallestAndLargest for calculating smallest and largest
        int result[]=findSmallestAndLargest(num1,num2,num3);
        
        //Displaying results
        System.out.println("Smallest number - "+result[0]);
        System.out.println("Largest number - "+result[1]);
    }
    
    //Method to find smallest and largest Number
    public static int[] findSmallestAndLargest(int num1,int num2,int num3){
        int smallest=num1;
        int largest=num1;
        
        if(num2<smallest){
            smallest=num2;
        }
        if(num3<smallest){
            smallest=num3;
        }
        
        if(num2>largest){
            largest=num2;
        }
        if(num3>largest){
            largest=num3;
        }
        
        return new int[]{smallest,largest};
    }
}