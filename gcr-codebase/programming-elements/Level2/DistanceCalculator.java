import java.util.Scanner;

class DistanceCalculator {

    public static void main(String args[]) {

        // Taking user input for distance in feet
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();

        // Conversion of distance in yards and miles
        double yards=feet/3;
        double miles=yards/1760;

        // Printing the distance in yards and miles
        System.out.println("The distance in yards is " +yards+" and the distance in miles is " + miles);
    }
}