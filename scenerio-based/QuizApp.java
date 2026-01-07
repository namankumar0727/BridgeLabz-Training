import java.util.Scanner;

public class QuizApp{

    public static void main(String[] args) {

		//Taking the inputs from the user
        Scanner sc = new Scanner(System.in);
        String[] questions={
            "1 - Which is the cleanest city in India?",
            "2 - What is the capital of India?",
            "3 - What is the currency of India?",
            "4 - Which state have the highest literacy rate?",
            "5 - Which is the best way to score in exams?"
        };
        String[][] options = {
			{"A. Indore", "B. Bhopal", "C. Jabalpur", "D. Noida"},
            {"A. Delhi", "B. Gurugram", "C. Kolkata", "D. Chennai"},
            {"A. rupee", "B. dollar", "C. Riyal", "D. Euro"},
            {"A. Haryana", "B. Kerala", "C. Telangana", "D. West Bengal"},
            {"A. Study", "B. Chill, "C. Drill", "D. Nothing"}
        };
        char[] answers = {'A', 'A', 'A', 'B', 'A'};
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        score++;
                    }
                    break;
                default:
                    System.out.println("Invalid option! No score awarded.");
            }
        }
        System.out.println("\n====================");
        System.out.println("Quiz Completed!");
        System.out.println("Your Score - "+score+" out of "+questions.length);
        System.out.println("====================");
        sc.close();
    }
}
