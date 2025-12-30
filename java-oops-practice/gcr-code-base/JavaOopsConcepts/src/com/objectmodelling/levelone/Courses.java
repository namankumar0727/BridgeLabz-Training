package com.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Communication method
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
        System.out.println("Prof. " + professor.getProfessorName() +
                           " assigned to " + courseName);
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getStudentName());
        }
    }
}
