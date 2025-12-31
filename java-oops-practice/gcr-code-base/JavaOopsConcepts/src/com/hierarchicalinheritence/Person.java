package com.hierarchicalinheritence;

public class Person {
	
	//variables
    String name;
    int age;

    //Constructors
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

