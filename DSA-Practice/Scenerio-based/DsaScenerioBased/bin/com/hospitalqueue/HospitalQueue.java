package com.hospitalqueue;
class HospitalQueue {

    // Bubble Sort by criticality (descending)
    public static void sortByCriticality(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (patients[j].getCriticality()
                        < patients[j + 1].getCriticality()) {

                    // swap adjacent patients (in-place)
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    public static void displayPatients(Patient[] patients) {
        for (Patient p : patients) {
            p.display();
        }
    }
}
