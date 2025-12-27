package com.constructor.levelone;

public class UseEmployee {
	    public static void main(String[] args) {

	        Manager m =
	                new Manager(201, "IT", 75000, "Project Manager");

	        m.displayManagerDetails();

	        // Modifying salary using public method
	        m.updateSalary(85000);

	        System.out.println("Updated Salary: " + m.getSalary());
	    }

}
