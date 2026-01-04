package com.universitycourseenrollmentsystem;

public class Postgraduate extends Student {

    Postgraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(String courseCode, double marks) {
        // stricter evaluation
        grades.put(courseCode, marks >= 40 ? marks : 0);
        calculateGPA();
    }
}
