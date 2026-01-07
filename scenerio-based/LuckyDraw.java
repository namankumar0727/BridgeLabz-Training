import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
	
		//Taking inputs from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();
        for (int i = 1; i <= visitors; i++) {
            System.out.print("Visitor " + i + " enter your number: ");
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Invalid number. Try next visitor.");
                continue;
            }
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Congratulations! You won a gift");
            }
			else {
                System.out.println("Better luck next time!");
            }
        }
        sc.close();
    }
}
