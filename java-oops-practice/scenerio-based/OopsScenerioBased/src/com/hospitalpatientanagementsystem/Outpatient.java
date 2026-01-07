package com.hospitalpatientanagementsystem;

public class Outpatient extends Patient {

    private double consultationFee;

    Outpatient(int patientId, String name, int age,
               String medicalHistory, double consultationFee) {
        super(patientId, name, age, medicalHistory);
        this.consultationFee = consultationFee;
    }

    double getConsultationFee() {
        return consultationFee;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Patient Type: Out-Patient");
    }
}
