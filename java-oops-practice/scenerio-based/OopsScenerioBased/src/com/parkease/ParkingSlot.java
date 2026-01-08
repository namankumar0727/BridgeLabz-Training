package com.parkease;
public class ParkingSlot {
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    protected void occupySlot() {
        this.isOccupied = true;
    }

    protected void freeSlot() {
        this.isOccupied = false;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }
}
