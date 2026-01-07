package com.encapsulation.EmployeeManagementSystem;

public class FullTimeEmployee extends Employee {

    private double bonus;

    FullTimeEmployee(int employeeId, String name,
                     double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}
