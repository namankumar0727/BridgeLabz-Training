package com.universitycourseenrollmentsystem;

public class Enrollment {
    static void enroll(Student student, Course course) {
        System.out.print("Enrolled in: ");
        course.displayCourse();
    }
}
