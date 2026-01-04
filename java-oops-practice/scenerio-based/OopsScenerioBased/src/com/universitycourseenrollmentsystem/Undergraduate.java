package com.universitycourseenrollmentsystem;

public class Undergraduate extends Student {

    Undergraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(String courseCode, double marks) {
        grades.put(courseCode, marks);
        calculateGPA();
    }
}
