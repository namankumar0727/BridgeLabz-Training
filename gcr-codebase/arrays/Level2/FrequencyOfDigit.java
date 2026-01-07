import java.util.Scanner;
public class FrequencyOfDigit{

    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        //Taking user inputs
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
			int tempNumber=number;
			int count=0;
        while(tempNumber!=0){
           tempNumber=tempNumber/10;
            count++;
        }  
        int digits[]=new int[count];
        int index=0;
        tempNumber=number;
        while(tempNumber!=0){
            digits[index]=tempNumber%10;
            tempNumber=tempNumber/10;
            index++;
        }
        
        int frequency[]=new int[10];
        
        //finding frequency of each digit
        for(int i=0;i<count;i++){
            frequency[digits[i]]++;
        }
		
        //Displaying output
        for(int i=0;i<10;i++){
            if(frequency[i]>0){
                System.out.println(i+" : "+frequency[i]);
            }
         }
  }
}