package com.parkease;
public class Main {
    public static void main(String[] args) {

        ParkingSlot slot1 = new ParkingSlot("A1","Mall Basement","Car");

        Vehicle car = new Car("KA-01-1234");

        ParkingManager manager=new ParkingManager();

        if (manager.assignSlot(slot1,car)) {
            System.out.println("Parking is Assigned");
        } else {
            System.out.println("Parking is Failed");
        }

        manager.releaseSlot(slot1, car, 7);

        manager.showLogs();
    }
}
