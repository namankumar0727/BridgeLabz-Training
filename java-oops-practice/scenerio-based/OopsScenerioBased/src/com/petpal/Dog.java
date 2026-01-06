package com.petpal;
class Dog extends Pet {

    // Constructor
    Dog(String name, int age) {
        super(name, "Dog", age);
    }

    // Feeding behavior
    public void feed() {
        changeHunger(-20);
        changeMood(10);
        energy += 5;
    }

    // Playing behavior
    public void play() {
        changeMood(20);
        changeHunger(10);
        energy -= 15;
    }

    // Sleeping behavior
    public void sleep() {
        energy += 30;
    }

    // Dog sound
    void makeSound() {
        System.out.println(name + " says: Wooooooof");
    }
}
