import java.util.Scanner;
public class StudentVoteChecker{

    //Method to check if person can vote or not
    public boolean canStudentVote(int age){
        if(age<0){
            return false;
        }
        if(age>=18){
            return true;
        }
        return false;
    }
	
    public static void main(String[]args){
        
        //Taking inputs from the user
        Scanner sc=new Scanner(System.in);
        StudentVoteChecker obj=new StudentVoteChecker();
        int age[]=new int[10];
        for(int i=0;i<10;i++){
            age[i]=sc.nextInt();
        }
        
        //checking voting eligibility
        for(int i=0;i<10;i++){
            if(obj.canStudentVote(age[i])){
                System.out.println("Student with age "+age[i]+" can vote");
            }else{
                System.out.println("Student with age "+age[i]+" cannot vote");
            }
        }
    }
}