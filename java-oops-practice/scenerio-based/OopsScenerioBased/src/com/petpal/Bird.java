package com.petpal;
class Bird extends Pet {

    // Constructor
    Bird(String name, int age) {
        super(name,"Bird", age);
    }

    public void feed() {
        changeHunger(-10);
        changeMood(10);
    }

    public void play() {
        changeMood(15);
        energy -= 5;
    }

    public void sleep() {
        energy += 20;
    }

    void makeSound() {
        System.out.println(name + " says pee pee");
    }
}
