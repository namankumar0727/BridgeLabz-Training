import java.util.Scanner;
class MeanHeight{
	public static void main(String args[]){
	
	//Taking input of heights in an array
	Scanner sc=new Scanner(System.in);
	double heights[]=new double[11];
	double heightSum=0.0;
	for(int i=0;i<11;i++){
		heights[i]=sc.nextDouble();
	}
	
	//Calculating sum of heights and calculating mean of heights
	for(int i=0;i<11;i++){
		heightSum+=heights[i];
	}
	double mean=heightSum/11;
	
	//Displaying mean of heights 
	System.out.println(mean);
	}
}
