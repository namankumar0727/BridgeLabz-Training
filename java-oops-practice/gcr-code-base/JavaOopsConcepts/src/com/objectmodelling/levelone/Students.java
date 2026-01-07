package com.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;

class Students {

	//List of Courses
    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    // Communication method
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    public void showCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
