package com.birdsanctuary;
@DeveloperInfo(developer = "EcoWing Team", date = "2026-01-19", version = "1.0")
class Duck extends Bird implements Flyable, Swimmable {

    public Duck(int id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println(getName() + " flies short distances.");
    }

    public void swim() {
        System.out.println(getName() + " swims gracefully.");
    }

    public void displayAbilities() {
        System.out.println("Abilities: Fly & Swim");
    }
}
