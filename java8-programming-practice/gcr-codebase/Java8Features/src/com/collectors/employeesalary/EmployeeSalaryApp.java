package com.collectors.employeesalary;
import java.util.*;
import java.util.stream.*;

public class EmployeeSalaryApp {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Alice", "IT", 75000),
            new Employee("Bob", "HR", 50000),
            new Employee("Charlie", "IT", 82000),
            new Employee("Diana", "Finance", 68000),
            new Employee("Ethan", "HR", 54000),
            new Employee("Fiona", "Finance", 72000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                                              .collect(Collectors.groupingBy(
                                              Employee::getDepartment,
                                              Collectors.averagingDouble(Employee::getSalary)));

        avgSalaryByDept.forEach((dept, avgSalary) ->
            System.out.println(dept + " Average Salary: " + avgSalary)
        );
    }
}
