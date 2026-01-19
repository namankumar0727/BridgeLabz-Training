package com.examprotocol;
import java.util.Map;

class Evaluator {

    // Function to evaluate score
    public static int calculateScore(
            Map<Integer, String> studentAnswers,
            Map<Integer, String> correctAnswers) {

        int score = 0;

        for (Integer qId : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qId) &&
                studentAnswers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
