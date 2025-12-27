package com.constructor.levelone;

public class Manager {
	    String role;

	    // Constructor
	    public Manager(int employeeID, String department, double salary, String role) {
	     
	        this.role = role;
	    }

	    // Method to display accessible details
	    public void displayManagerDetails() {
	        System.out.println("Employee ID : " + employeeID);   // public
	        System.out.println("Department  : " + department);   // protected
	        System.out.println("Role        : " + role);
	        System.out.println("Salary      : " + getSalary());  // private via getter
	        System.out.println("-----------------------------");
	    }
}
