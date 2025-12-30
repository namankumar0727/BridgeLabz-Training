package com.objectmodelling.levelone;

public class UniversityAggregation {

	    public static void main(String[] args) {

	        // Faculty exists independently
	        Faculty f1 = new Faculty("A");
	        Faculty f2 = new Faculty("B");

	        // Create University
	        University uni = new University("TIT University");

	        // Composition: Departments created inside University
	        uni.addDepartment("Computer Science");
	        uni.addDepartment("ECE");

	        // Aggregation: Faculty added from outside
	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        uni.showDepartments();
	        System.out.println();

	        uni.showFaculties();
	        System.out.println();

	        // Delete University (Composition effect)
	        uni.deleteUniversity();

	        System.out.println();
	        System.out.println("Faculty still exists after University deletion:");
	        System.out.println(f1.getFacultyName());
	    
	}

}
