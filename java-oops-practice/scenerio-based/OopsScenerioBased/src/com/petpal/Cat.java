package com.petpal;
class Cat extends Pet {

    // Constructor
    Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public void feed() {
        changeHunger(-15);
        changeMood(5);
        energy += 5;
    }

    public void play() {
        changeMood(15);
        energy -= 10;
    }

    public void sleep() {
        energy += 25;
    }

    void makeSound() {
        System.out.println(name + " says: Meoaaow");
    }
}
