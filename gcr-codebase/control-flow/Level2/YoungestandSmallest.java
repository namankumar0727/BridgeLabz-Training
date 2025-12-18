import java.util.Scanner;

class YongestandSmallest {

    public static void main(String args[]) {

	//Taking inputs of age and height respectively
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of Amar");
        int amarAge=sc.nextInt();
        System.out.println("Enter age of Akbar");
        int akbarAge= sc.nextInt();
        System.out.println("Enter age of Anthony");
        int anthonyAge=sc.nextInt();
        System.out.println("Enter height of Amar");
        double amarHeight=sc.nextDouble();
        System.out.println("Enter height of Akbar");
        double akbarHeight=sc.nextDouble();
        System.out.println("Enter height of Anthony");
        double anthonyHeight=sc.nextDouble();

        //Calculation to find youngest and smallest among three and printing it
	int minAge=Math.min(amarAge,Math.min(akbarAge,anthonyAge));
	double maxHeight=Math.max(amarHeight,Math.max(akbarHeight,anthonyHeight));

        if (amarAge==minAge) {
            System.out.println("Amar is the youngest");
        }
        else if (akbarAge==minAge) {
            System.out.println("Akbar is the youngest");
        }
        else {
            System.out.println("Anthony is the youngest");
        }

        if (amarHeight==maxHeight) {
            System.out.println("Amar is the tallest");
        }
        else if (akbarHeight==maxHeight) {
            System.out.println("Akbar is the tallest");
        }
        else {
            System.out.println("Anthony is the tallest");
        }
    }
}
