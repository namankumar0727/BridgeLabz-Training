package com.examprotocol;
import java.util.HashMap;
import java.util.Map;

class AnswerSheet {
    private Map<Integer, String> answers = new HashMap<>();

    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Q" + questionId);
    }

    public Map<Integer, String> getAnswers() {
        return answers;
    }
}
