package com.birdsanctuary;
@DeveloperInfo(developer = "EcoWing Team", date = "2026-01-19", version = "1.0")
class Eagle extends Bird implements Flyable {

    public Eagle(int id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println(getName() + " soars high in the sky.");
    }

    public void displayAbilities() {
        System.out.println("Abilities: Fly");
    }
}
