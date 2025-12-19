import java.util.Scanner;
class BMICalculator2D{
public static void main(String args[]){

	//Taking input
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	double personData[][]=new double[number][3];
	String weightStatus[]=new String[number];
	for(int i=0;i<number;i++){
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		if(w<=0||h<=0){
			i--;
		continue;
		}
		personData[i][0]=h;
		personData[i][1]=w;
	}
	for(int i=0;i<number;i++){
		personData[i][2]=personData[i][1]/(personData[i][0]*personData[i][0]);
		if(personData[i][2]<18.5){
			weightStatus[i]="Underweight";
		}
		else if(personData[i][2]<25){
			weightStatus[i]="Normal";
		}	
		else if(personData[i][2]<30){
			weightStatus[i]="Overweight";
		}
		else{
			weightStatus[i]="Obese";
		}
	}
	
	//Displaying output of the personData
	for(int i=0;i<number;i++){
		System.out.println(personData[i][0]+" "+personData[i][1]+" "+personData[i][2]+" "+weightStatus[i]);
	}
	}
}
