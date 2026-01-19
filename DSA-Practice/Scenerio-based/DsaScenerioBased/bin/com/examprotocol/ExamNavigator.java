package com.examprotocol;
import java.util.Stack;

class ExamNavigator {
    private Stack<Integer> questionStack = new Stack<>();

    public void visitQuestion(int questionId) {
        questionStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void goBack() {
        if (questionStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        System.out.println("Back from Question: " + questionStack.pop());
    }

    public Integer currentQuestion() {
        if (questionStack.isEmpty()) return null;
        return questionStack.peek();
    }
}
