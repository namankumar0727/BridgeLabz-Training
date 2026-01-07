package com.mutilevelinheritence;

public class Course {
	
	//Declaring the variables
    String courseName;
    int duration;

    //Constructors
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
