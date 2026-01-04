package com.hospitalpatientanagementsystem;

public class Patient {

    protected int patientId;
    protected String name;
    protected int age;
    protected Doctor assignedDoctor;

    private String medicalHistory; 
    protected boolean isEmergency;

    // Normal admission
    Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.isEmergency = false;
    }

    // Emergency admission (constructor overloading)
    Patient(int patientId, String name, int age) {
        this(patientId, name, age, "Emergency Case");
        this.isEmergency = true;
    }

    public void assignDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
    }

    // Encapsulated access
    public String getSummary() {
        return "Patient: " + name +
               ", Age: " + age +
               ", Emergency: " + isEmergency;
    }

    void displayInfo() {
        System.out.println(getSummary());
        if (assignedDoctor != null) {
            System.out.println("Doctor: " + assignedDoctor.getName());
        }
    }
}

