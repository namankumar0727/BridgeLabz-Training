package com.encapsulation.EmployeeManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee e1 =
                new FullTimeEmployee(101, "Naman", 50000, 10000);
        e1.assignDepartment("CSE");

        Employee e2 =
                new PartTimeEmployee(202, "abc", 80, 500);
        e2.assignDepartment("IT");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);

        PayrollService.processEmployees(employees);
    }
}
