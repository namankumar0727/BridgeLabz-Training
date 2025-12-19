import java.util.Scanner;
class StoreSum{
public static void main(String args[]){
	
	//Taking input of the user in the array
	Scanner sc=new Scanner(System.in);
	double a[]=new double[10];
	double sum=0.0;
	int index=0;
	while(true){
		double num=sc.nextDouble();
		if(num<=0||index==10){
		break;
	}
		a[index]=num;
		index++;
	}
	
	//Calculating sum of the array
	for(int i=0;i<index;i++){
		sum+=a[i];
	}
	
	//Displaying sum of the array
	System.out.println(sum);
	}
}
