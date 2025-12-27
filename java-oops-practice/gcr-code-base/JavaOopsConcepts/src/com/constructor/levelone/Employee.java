package com.constructor.levelone;

public class Employee {

	    // Public member (accessible everywhere)
	    public int employeeID;

	    // Protected member (accessible in same package & subclasses)
	    protected String department;

	    // Private member (accessible only within this class)
	    private double salary;

	    // Constructor
	    public Employee(int employeeID, String department, double salary) {
	        this.employeeID = employeeID;
	        this.department = department;
	        this.salary = salary;
	    }

	    // Public getter for salary
	    public double getSalary() {
	        return salary;
	    }

	    // Public method to modify salary
	    public void updateSalary(double newSalary) {
	        if (newSalary > 0) {
	            salary = newSalary;
	        } else {
	            System.out.println("Invalid salary amount");
	        }
	    }
}
