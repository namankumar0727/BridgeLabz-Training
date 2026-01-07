package com.universitycourseenrollmentsystem;

public class Faculty {
    private String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    void gradeStudent(Graded student, String courseCode, double marks) {
        student.assignGrade(courseCode, marks);
        System.out.println("Grade assigned by " + facultyName);
    }
}
