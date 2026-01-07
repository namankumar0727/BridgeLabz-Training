package com.campusconnect;
import java.util.ArrayList;
import java.util.List;

class Student extends Person implements ICourseActions {

    private List<Integer> grades;      // encapsulated
    private List<Course> courses;

    Student(int id, String name, String email) {
        super(id, name, email);
        grades = new ArrayList<>();
        courses = new ArrayList<>();
    }

    // Add grade (controlled access)
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // GPA calculation using operators
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;

        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    @Override
    void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}
