package com.birdsanctuary;
import java.util.*;
import java.lang.reflect.*;

class BirdSanctuary {

    private List<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    public void removeBirdById(int id) {
        birds.removeIf(b -> b.getId() == id);
        System.out.println("Bird removed if ID existed.");
    }

    public void displayAllBirds() {
        for (Bird b : birds) {
            System.out.println("\nID: " + b.getId());
            System.out.println("Name: " + b.getName());
            System.out.println("Species: " + b.getSpecies());
            b.displayAbilities();
            b.eat();

            // 🔍 Reflection usage
            Class<?> cls = b.getClass();
            if (cls.isAnnotationPresent(DeveloperInfo.class)) {
                DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
                System.out.println("Developed by: " + info.developer());
            }
        }
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, none = 0;

        for (Bird b : birds) {
            boolean canFly = b instanceof Flyable;
            boolean canSwim = b instanceof Swimmable;

            if (canFly && canSwim) both++;
            else if (canFly) fly++;
            else if (canSwim) swim++;
            else none++;
        }

        System.out.println("\n--- Sanctuary Report ---");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + none);
    }
}
