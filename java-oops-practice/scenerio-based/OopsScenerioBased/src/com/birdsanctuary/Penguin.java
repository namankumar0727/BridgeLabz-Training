package com.birdsanctuary;
@DeveloperInfo(developer = "EcoWing Team", date = "2026-01-19", version = "1.0")
class Penguin extends Bird implements Swimmable {

    public Penguin(int id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(getName() + " swims underwater.");
    }

    public void displayAbilities() {
        System.out.println("Abilities: Swim");
    }
}
