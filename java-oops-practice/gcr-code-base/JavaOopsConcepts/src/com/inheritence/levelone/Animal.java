package com.inheritence.levelone;

public class Animal {
	
	//Declaring the variables
    String name;
    int age;
    
    //Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
