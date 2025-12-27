package com.constructor.levelone;

public class UseCourse {
	public class UseCourse {

	    public static void main(String[] args) {

	        Course c1 = new Course("Java Full Stack", 6, 45000);
	        Course c2 = new Course("Data Science", 8, 60000);

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();

	        // Updating institute name for all courses
	        Course.updateInstituteName("XYZ Technologies");

	        // Display again after update
	        c1.displayCourseDetails();
	        c2.displayCourseDetails();
	    }
	}

}
