package com.ambulanceroute;
public class AmbulanceRoute {
    private HospitalUnit head;
    private HospitalUnit current;


    // Add hospital unit
    public void addUnit(String name) {
        HospitalUnit newUnit = new HospitalUnit(name);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            current = head;
        } else {
            HospitalUnit temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newUnit;
            newUnit.next = head;
        }
        System.out.println("Unit has been added: " + name);
    }

    // Mark unit unavailable (maintenance)
    public void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit temp = head;
        HospitalUnit prev = null;

        do {
            if (temp.name.equalsIgnoreCase(name)) {
                if (temp == head && temp.next == head) {
                    head = null;
                    current = null;
                } else {
                    if (temp == head) {
                        HospitalUnit last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = temp.next;
                    }
                }
                System.out.println("Unit is under maintenance: " + name);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Unit not found.");
    }

    // Find nearest available unit
    public void redirectPatient() {
        if (current == null) {
            System.out.println("No hospital units are available.");
            return;
        }

        HospitalUnit start = current;

        do {
            if (current.available) {
                System.out.println("Patient sent to - " + current.name);
                current = current.next;
                return;
            }
            current = current.next;
        } while (current != start);

        System.out.println("No available units at the moment.");
    }

    // Display all units
    public void displayUnits() {
        if (head == null) {
            System.out.println("No hospital units.");
            return;
        }

        HospitalUnit temp = head;
        System.out.println("\n Hospital Units:");
        do {
            System.out.println(" - " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}
