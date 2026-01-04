package com.universitycourseenrollmentsystem;

public class UniversityCourseEnrollmentSystem {
	    public static void main(String[] args) {

	        Course c1 = new Course("CS101", "Data Structures", 4);
	        Course c2 = new Course("MA201", "Discrete Maths", 3);

	        Student ug = new Undergraduate(1, "Naman");
	        Student pg = new Postgraduate(2, "abc");

	        Enrollment.enroll(ug, c1);
	        Enrollment.enroll(pg, c2);

	        Faculty f = new Faculty("Mr. thakur");

	        f.gradeStudent(ug, "RGPV101", 85);
	        f.gradeStudent(pg, "RGPV201", 38);

	        System.out.println();
	        ug.viewTranscript();
	        System.out.println();
	        pg.viewTranscript();
	    }
	}
