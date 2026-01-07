package com.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;

class Professor {
	
	//Creation of Lists
    private String professorName;
    private List<Course> courses;

    public Professor(String professorName) {
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }
    
    //
    public String getProfessorName() {
        return professorName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showCourses() {
        System.out.println("Courses taught by A " + professorName + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

