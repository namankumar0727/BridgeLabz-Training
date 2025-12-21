import java.util.Scanner;
public class LineAndDistance{

    //method to find Euclidean distance between two points
    public static double findDistance(double x1,double y1,double x2,double y2){
        double dx=Math.pow(x2-x1,2);
        double dy=Math.pow(y2-y1,2);
        return Math.sqrt(dx+dy);
    }
    
    //method to find slope and y-intercept
    public static double[] findLineEquation(double x1,double y1,double x2,double y2){
        double m=(y2-y1)/(x2-x1);
        double b=y1-(m*x1);
        return new double[]{m,b};
    }

    public static void main(String[]args){
        
        //Taking the user inputs
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 y1");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.print("Enter x2 y2");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
 
        //Calling methods to calculate distance and line equation
        double distance=findDistance(x1,y1,x2,y2);
        double line[]=findLineEquation(x1,y1,x2,y2);
        
        //Displaying results of euclidean distance and equation of line
        System.out.println("Euclidean Distance - "+distance);
        System.out.println("Equation of line - y = "+line[0]+" * x + "+line[1]);
    }
}