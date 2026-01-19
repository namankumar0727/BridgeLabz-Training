package com.examprotocol;
import java.util.HashMap;
import java.util.Map;

public class ExamProctor {
    public static void main(String[] args) {

        ExamNavigator navigator = new ExamNavigator();
        AnswerSheet sheet = new AnswerSheet();

        // Correct answers
        Map<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");

        // Student navigation
        navigator.visitQuestion(1);
        sheet.submitAnswer(1, "A");

        navigator.visitQuestion(2);
        sheet.submitAnswer(2, "B");

        navigator.visitQuestion(3);
        sheet.submitAnswer(3, "D");

        navigator.goBack(); // stack operation

        // Auto evaluation
        int score = Evaluator.calculateScore(
                sheet.getAnswers(), correctAnswers);

        System.out.println("\nFinal Score: " + score + "/" + correctAnswers.size());
    }
}
