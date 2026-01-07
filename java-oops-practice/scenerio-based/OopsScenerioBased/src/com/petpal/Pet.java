package com.petpal;
import java.util.Random;

abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   
    private int mood;    
    protected int energy;

    // Constructor with random default values
    Pet(String name, String type, int age) {
        Random rand = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = rand.nextInt(50) + 30;
        this.mood = rand.nextInt(50) + 30;
        this.energy = rand.nextInt(50) + 30;
    }

    // Constructor with user-defined values
    Pet(String name, String type, int age, int hunger, int mood, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.mood = mood;
        this.energy = energy;
    }

    // Method to safely update hunger
    protected void changeHunger(int value) {
        hunger += value;
        if (hunger < 0) hunger = 0;
        if (hunger > 100) hunger = 100;
    }

    // Method to safely update mood
    protected void changeMood(int value) {
        mood += value;
        if (mood < 0) mood = 0;
        if (mood > 100) mood = 100;
    }

    // Display pet status
    public void displayStatus() {
        System.out.println("\nPet Name - " + name);
        System.out.println("Type - " + type);
        System.out.println("Age - " + age);
        System.out.println("Hunger Level - " + hunger);
        System.out.println("Mood Level -  " + mood);
        System.out.println("Energy Level - " + energy);
    }

    // Polymorphic method
    abstract void makeSound();
}
