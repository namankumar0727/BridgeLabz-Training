package com.birdsanctuary;
@DeveloperInfo(developer = "EcoWing Team", date = "2026-01-19", version = "1.0")
class Kiwi extends Bird {

    public Kiwi(int id, String name) {
        super(id, name, "Kiwi");
    }

    public void displayAbilities() {
        System.out.println("Abilities: Walk only");
    }
}
