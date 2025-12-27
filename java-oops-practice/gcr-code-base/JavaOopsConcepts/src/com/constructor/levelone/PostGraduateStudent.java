package com.constructor.levelone;

	public class PostGraduateStudent extends Student {

	    String specialization;

	    // Constructor
	    public PostGraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
	        super(rollNumber, name, cgpa);
	        this.specialization = specialization;
	    }

	    // Method to display details
	    public void displayDetails() {
	        System.out.println("Roll Number     : " + rollNumber);  // public
	        System.out.println("Name            : " + name);        // protected
	        System.out.println("Specialization  : " + specialization);
	        System.out.println("CGPA            : " + getCGPA());   // private via getter
	        System.out.println("-----------------------------");
	    }
	}