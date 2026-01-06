package com.edumentor;
class Quiz {

	// private question bank
	// encapsulated (immutable)
    private String[] questions;     
    private final int[] answers;    
    private int score;
    private String difficulty;

    // Constructor with variable difficulty
    Quiz(String[] questions, int[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
    }

    // Evaluate quiz using operators
    public void evaluate(int[] userAnswers) {
        score = 0;
        for (int i=0;i<answers.length;i++) {
            if (userAnswers[i]==answers[i]) {
                score++;
            }
        }
    }

    public double getPercentage() {
        return ((double) score / answers.length) * 100;
    }

    public void displayResult() {
        System.out.println("Quiz Difficulty -  " + difficulty);
        System.out.println("Score - " + score + "/" + answers.length);
        System.out.println("Percentage - " + getPercentage() + "%");
    }
}
