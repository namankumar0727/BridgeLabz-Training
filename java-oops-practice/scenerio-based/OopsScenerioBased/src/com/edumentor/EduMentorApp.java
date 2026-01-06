package com.edumentor;
public class EduMentorApp {
    public static void main(String[] args) {

        // Users
        Learner learner = new Learner(101, "Naman", "namankumar0727@gmail.com", "Short");
        Instructor instructor = new Instructor(201, "Dr. Newton", "newton@edumentor.com", "Computer Science");

        // Polymorphism
        User u1 = learner;
        User u2 = instructor;

        System.out.println("---- Details of User ----");
        u1.printDetails();
        System.out.println();
        u2.printDetails();

        // Quiz
        String[] questions = {
            "What is Java?",
            "What is OOPs?"
        };

        int[] correctAnswers = {1, 2}; // encapsulated
        Quiz quiz = new Quiz(questions, correctAnswers, "Easy");

        int[] userAnswers = {1, 2};
        quiz.evaluate(userAnswers);
        quiz.displayResult();

        // Certificate generation
        learner.generateCertificate();
    }
}
