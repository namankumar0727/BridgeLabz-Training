package com.hospitalqueue;
class Patient {
    private int id;
    private String name;
    private int criticality; // 1 (low) → 10 (high)

    public Patient(int id, String name, int criticality) {
        this.id = id;
        this.name = name;
        this.criticality = criticality;
    }

    public int getCriticality() {
        return criticality;
    }

    public void display() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Criticality: " + criticality
        );
    }
}
