import java.util.Scanner;
public class FindYoungestAndTallest{
   
   //Method to find Tallest and Youngest friend
    public static int findYoungest(int age[]){
        int minIndex=0;
        for(int i=1;i<age.length;i++){
            if(age[i]<age[minIndex]){
                minIndex=i;
			}
        }
        return minIndex;
    }
	
    public static int findTallest(int height[]){
        int maxIndex=0;
        for(int i=1;i<height.length;i++){
            if(height[i]>height[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static void main(String[]args){
        
        //Taking input from the user
        Scanner sc=new Scanner(System.in);
        String names[]={"Amar","Akbar","Anthony"};
        int age[]=new int[3];
        int height[]=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter age of "+names[i]+": ");
            age[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.print("Enter height of "+names[i]+": ");
            height[i]=sc.nextInt();
        }
		
		//Calling methods for calculating youngest and tallest
        int youngestIndex=findYoungest(age);
        int tallestIndex=findTallest(height);
        
        //Displaying result for youngest and Tallest
        System.out.println(names[youngestIndex]+" is the youngest");
        System.out.println(names[tallestIndex]+" is the tallest");
    }
}