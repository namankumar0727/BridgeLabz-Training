package com.hierarchicalinheritence;

public class SchoolSystem {
	    public static void main(String[] args) {

	        Teacher teacher = new Teacher("naman. Kumar", 45, "Physics");
	        Student student = new Student("name1", 15, "9th Grade");
	        Staff staff = new Staff("name2", 38, "Office");

	        teacher.displayRole();
	        System.out.println();

	        student.displayRole();
	        System.out.println();

	        staff.displayRole();
	    }
	}

}
