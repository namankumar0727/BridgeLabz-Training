package com.constructor.levelone;

public class UseStudent {

	    public static void main(String[] args) {

	        PostGraduateStudent ps =
	                new PostGraduateStudent(101, "Naman", 8.6, "Computer Science");

	        ps.displayDetails();

	        // Modifying CGPA using public setter
	        ps.setCGPA(9.1);

	        System.out.println("Updated CGPA: " + ps.getCGPA());
	    }
	}

