package com.inheritence.levelone;

public class EmployeeManagement {
    public static void main(String[] args) {

        Employee e1 = new Manager("naman", 101, 80000, 10);
        Employee e2 = new Developer("name1", 102, 60000, "Java");
        Employee e3 = new Intern("name2", 103, 15000, 6);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}
