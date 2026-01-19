package com.trafficmanager;
public class Roundabout {
    private Vehicle head = null;

    public void addVehicle(String number) {
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }
        System.out.println("Vehicle " + number + " entered roundabout.");
    }

    public void removeVehicle(String number) {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.number.equals(number)) {
                if (curr == head) {
                    if (head.next == head) {
                        head = null;
                    } else {
                        Vehicle temp = head;
                        while (temp.next != head) {
                            temp = temp.next;
                        }
                        head = head.next;
                        temp.next = head;
                    }
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Vehicle " + number + " exited roundabout.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found.");
    }

    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
