package com.hospitalpatientanagementsystem;

public class Inpatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    Inpatient(int patientId, String name, int age,
              String medicalHistory, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, medicalHistory);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    double calculateRoomCharge() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Patient Type: In-Patient");
    }
}
