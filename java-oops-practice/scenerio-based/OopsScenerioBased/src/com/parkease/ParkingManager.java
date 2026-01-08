package com.parkease;
import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingLogs = new ArrayList<>(); // private records

    public boolean assignSlot(ParkingSlot slot, Vehicle vehicle) {

        if (!slot.isAvailable()) {
            return false;
        }

        if (!vehicle.getClass().getSimpleName()
                .equalsIgnoreCase(slot.getVehicleTypeAllowed())) {
            return false;
        }

        slot.occupySlot();
        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber()
                + " parked at slot " + slot.getSlotId());

        return true;
    }

    public void releaseSlot(ParkingSlot slot, Vehicle vehicle, int hours) {
        double charges = vehicle.calculateCharges(hours);
        slot.freeSlot();

        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber()
                + " exited. Charges: ₹" + charges);
    }

    // Expose logs safely
    public void showLogs() {
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
