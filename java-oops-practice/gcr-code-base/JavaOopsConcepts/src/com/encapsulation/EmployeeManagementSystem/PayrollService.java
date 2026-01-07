package com.encapsulation.EmployeeManagementSystem;

import java.util.List;

public class PayrollService {

    static void processEmployees(List<Employee> employees) {
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary is about -  ₹" + emp.calculateSalary());
        }
    }
}
