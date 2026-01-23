package com.medwarehouse;
import java.util.Scanner;

public class MedWarehouseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of medicines: ");
        int n = sc.nextInt();
        sc.nextLine();

        Medicine[] medicines = new Medicine[n];

        System.out.println("\nEnter medicine details (branch-wise sorted by expiry):");

        for (int i = 0; i < n; i++) {
            System.out.println("\nMedicine " + (i + 1));

            System.out.print("Medicine Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry in days: ");
            int days = sc.nextInt();
            sc.nextLine();

            medicines[i] = new Medicine(name, days);
        }

        // Merge Sort to combine all branch lists
        MergeSortMedicines.mergeSort(medicines, 0, n - 1);

        System.out.println("\n📦 Sorted Medicines by Expiry:");
        for (Medicine med : medicines) {
            System.out.println(med);
        }

        System.out.println("\n⚠️ Expiry Alerts (≤ 7 days):");
        for (Medicine med : medicines) {
            if (med.expiryDays <= 7) {
                System.out.println("ALERT → " + med);
            }
        }

        sc.close();
    }
}
