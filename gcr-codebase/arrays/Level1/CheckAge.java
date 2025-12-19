import java.util.Scanner;

class CheckAge{
	
	public static void main(String args[]){
			
		//Taking user inputs for the age
		Scanner sc=new Scanner(System.in);
		int age[]=new int[10];
		for(int i=0;i<10;i++){
			age[i]=sc.nextInt();
		}
		
		//Checking if the user can vote or not
		for(int i=0;i<10;i++){
			if(age[i]>=18){
				System.out.println("Student with the age "+age[i]+" can vote");
			}
			else if(age[i]<18 && age[i]>=0){
				System.out.println("Student with the age "+age[i]+" cannot vote");
			}
			else{
				System.out.println("Invalid Age");
			}
		}
	}
}