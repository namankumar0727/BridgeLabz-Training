import java.util.Scanner;

public class RouteTrackerS{
    public static void main(String[] args) {

		//Taking inputs from the user
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        char getOff = 'n';
        while (getOff != 'y' && getOff != 'Y') {
            System.out.print("Enter distance covered at this stop (km): ");
            int distance=sc.nextInt();
            totalDistance+=distance;
            System.out.print("Do you want to get off? (y/n): ");
            getOff=sc.next().charAt(0);
        }
        System.out.println("Total distance travelled: " + totalDistance + " km");
        sc.close();
    }
}
