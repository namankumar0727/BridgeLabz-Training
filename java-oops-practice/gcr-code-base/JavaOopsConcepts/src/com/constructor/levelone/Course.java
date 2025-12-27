package com.constructor.levelone;

public class Course {
	    // Instance variables (different for each course)
	    String courseName;
	    int duration;      // in months
	    double fee;

	    // Class variable (common for all courses)
	    static String instituteName = "ABC Institute";

	    // Parameterized Constructor
	    public Course(String courseName, int duration, double fee) {
	        this.courseName = courseName;
	        this.duration = duration;
	        this.fee = fee;
	    }

	    // Instance method
	    public void displayCourseDetails() {
	        System.out.println("Institute Name : " + instituteName);
	        System.out.println("Course Name    : " + courseName);
	        System.out.println("Duration       : " + duration + " months");
	        System.out.println("Fee            : ₹" + fee);
	        System.out.println("----------------------------");
	    }

	    // Class (static) method
	    public static void updateInstituteName(String newName) {
	        instituteName = newName;
	    }
	}

