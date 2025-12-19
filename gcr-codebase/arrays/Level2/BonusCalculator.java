import java.util.Scanner;
class BonusCalculator{
	public static void main(String args[]){
	
	//Taking inputs from the user
	Scanner sc=new Scanner(System.in);
	double salary[]=new double[10];
    double service[]=new double[10];
    double bonus[]=new double[10];
    double newSalary[]=new double[10];
    double totalBonus=0.0;
    double totalOldSalary=0.0;
    double totalNewSalary=0.0;
    for(int i=0;i<10;i++){
		double s=sc.nextDouble();
		double y=sc.nextDouble();
		if(s<=0||y<0){
			i--;
			continue;
		}
		salary[i]=s;
		service[i]=y;
	}
	
	//Calculating bonus, old salary and new salary
	for(int i=0;i<10;i++){
		if(service[i]>5){
			bonus[i]=salary[i]*0.05;
		}
	else{
		bonus[i]=salary[i]*0.02;
	}
	newSalary[i]=salary[i]+bonus[i];
	totalBonus+=bonus[i];
	totalOldSalary+=salary[i];
	totalNewSalary+=newSalary[i];
	}
	
	//Displaying Total bonus, Old Salary and New Salary
	System.out.println(totalBonus);
	System.out.println(totalOldSalary);
	System.out.println(totalNewSalary);
	}
}
