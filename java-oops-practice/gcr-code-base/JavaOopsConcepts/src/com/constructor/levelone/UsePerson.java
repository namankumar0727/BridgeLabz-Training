package com.constructor.levelone;

public class UsePerson {

		    public static void main(String[] args) {

		        // Original object
		        Person p1 = new Person("Naman", 21);
		        p1.display();

		        // Clone object using copy constructor
		        Person p2 = new Person(p1);
		        p2.display();
		    }
}
