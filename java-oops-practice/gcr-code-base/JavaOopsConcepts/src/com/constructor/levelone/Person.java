package com.constructor.levelone;

public class Person {
	    String name;
	    int age;

	    // Parameterized Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Copy Constructor
	    public Person(Person p) {
	        this.name = p.name;
	        this.age = p.age;
	    }

	    // Method to display details
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age : " + age);
	    }

}
