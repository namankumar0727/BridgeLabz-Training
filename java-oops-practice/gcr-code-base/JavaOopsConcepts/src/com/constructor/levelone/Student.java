package com.constructor.levelone;

public class Student {

	    // Public member (accessible everywhere)
	    public int rollNumber;

	    // Protected member (accessible in same package & subclasses)
	    protected String name;

	    // Private member (accessible only inside this class)
	    private double cgpa;

	    // Constructor
	    public Student(int rollNumber, String name, double cgpa) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.cgpa = cgpa;
	    }

	    // Public getter for CGPA
	    public double getCGPA() {
	        return cgpa;
	    }

	    // Public setter for CGPA
	    public void setCGPA(double cgpa) {
	        if (cgpa >= 0.0 && cgpa <= 10.0) {
	            this.cgpa = cgpa;
	        } else {
	            System.out.println("Invalid CGPA value");
	        }
	    }

}
