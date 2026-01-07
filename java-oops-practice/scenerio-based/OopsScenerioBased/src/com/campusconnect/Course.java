package com.campusconnect;
import java.util.ArrayList;
import java.util.List;

class Course {

    private String courseName;
    private Faculty faculty;
    private List<Student> students;

    //Constructor
    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}
