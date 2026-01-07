package com.hospitalpatientanagementsystem;

public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;

    Doctor(int doctorId, String name, String specialization) {
        this.doctorId=doctorId;
        this.name=name;
        this.specialization=specialization;
    }

    public String getName() {
        return name;
    }

    void displayInfo() {
        System.out.println("Doctor: " + name +", Specialization - " + specialization);
    }
}
