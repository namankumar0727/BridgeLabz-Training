package com.universitycourseenrollmentsystem;

import java.util.HashMap;

abstract class Student implements Graded {

    private int studentId;
    private String name;
    private double gpa; // private – secured
    protected HashMap<String, Double> grades;

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new HashMap<>();
    }

    // Encapsulation
    public double getGPA() {
        return gpa;
    }

    protected void calculateGPA() {
        double total = 0;
        for (double grade : grades.values()) {
            total += grade;
        }
        gpa = grades.size() > 0 ? total / grades.size() : 0;
    }

    public void viewTranscript() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        for (String c : grades.keySet()) {
            System.out.println(c + " : " + grades.get(c));
        }
        System.out.println("GPA: " + gpa);
    }
}
