package com.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;

class UniqueUniversity {

	//Different Lists
    private String universityName;
    private List<Student> students;
    private List<Professor> professors;
    private List<Course> courses;

    //Constructors
    public UniqueUniversity(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    
    
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
