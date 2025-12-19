import java.util.Scanner;

class MarksCalculator{
	
	public static void main(String args[]){
		
		//Taking input of the three subjects of student
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks in physics");
		int physicsMarks=sc.nextInt();
		System.out.println("Enter marks in chemistry");
		int chemistryMarks=sc.nextInt();
		System.out.println("Enter marks in maths");
		int mathsmarks=sc.nextInt();
		
		//Calculating average marks	
		int avgmarks=((physicsMarks+mathsmarks+chemistryMarks)/3);
		
		//Printing the remarks,grades and average marks of students
		if(avgmarks>=80){
			System.out.println("Grade - A ");
			System.out.println("Marks "+avgmarks);				
			System.out.println("Remarks - Level 4, Above agency normalized standards");				
			
		}
		else if(avgmarks>=70 && avgmarks<=79){
			System.out.println("Grade - B ");
			System.out.println("Marks "+avgmarks);				
			System.out.println("Remarks - Level 3, At agency normalized standards");				
			
		}
		else if(avgmarks>=60 && avgmarks<=69){
			System.out.println("Grade - C ");
			System.out.println("Marks "+avgmarks);				
			System.out.println("Remarks - Level 2, Below, but approaching agency normalized standards");				
			
		}
		else if(avgmarks>=50 && avgmarks<=59){
			System.out.println("Grade - D ");
			System.out.println("Marks "+avgmarks);				
			System.out.println("Remarks -  Level 1, Well Below agency normalized standards");				
			
		}
		else if(avgmarks>=40 && avgmarks<=49){
			System.out.println("Grade - E ");
			System.out.println("Marks "+avgmarks);				
			System.out.println("Remarks -  Level 1, To Below agency normalized standards");				
			
		}
		else{
			System.out.println("Grade - R ");
			System.out.println("Marks "+avgmarks);				
			System.out.println("Remarks -  Remedial Standards");	
		}
		
	}
	
}