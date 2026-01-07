package com.encapsulation.EmployeeManagementSystem;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    //Constructor
    PartTimeEmployee(int employeeId, String name,
                     int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0); // base salary not used
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
