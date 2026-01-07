package com.hospitalpatientanagementsystem;

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(1, "Dr. uncle", "heart");
        Doctor d2 = new Doctor(1, "Dr. xyz", "head");
        Patient p1 = new Inpatient(101, "Naman", 13, "Neck Problem", 5, 2500);
        Patient p2 = new Outpatient(202, "abc", 35, "fever", 800);
        Patient emergencyPatient =new Patient(303, "xyz", 50);

        p1.assignDoctor(d1);
        p2.assignDoctor(d1);
        emergencyPatient.assignDoctor(d1);

        // Polymorphism
        p1.displayInfo();
        p2.displayInfo();
        
        emergencyPatient.displayInfo();

        System.out.println();

        Bill bill1 = new Bill(p1, ((Inpatient) p1).calculateRoomCharge());
        bill1.displayBill();

        Bill bill2 = new Bill(p2, ((Outpatient) p2).getConsultationFee());
        bill2.displayBill();
    }
}
