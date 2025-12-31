package com.inheritence.levelone;

public class Employee {
	
	//Declaring the variables
    String name;
    int id;
    double salary;

    //Creating the constructors
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Methods
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
