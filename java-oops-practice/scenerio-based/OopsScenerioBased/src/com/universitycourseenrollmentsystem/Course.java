package com.universitycourseenrollmentsystem;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;

    Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }

    void displayCourse() {
        System.out.println(courseCode + " - " + courseName + " (" + credits + " credits)");
    }
}
