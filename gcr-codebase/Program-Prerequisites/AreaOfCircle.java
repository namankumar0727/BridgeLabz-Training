import java.util.Scanner;

class AreaOfCircle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		double area=(22/7)*radius;
		
		System.out.println("Area Of a Circle : "+area);
	}
}