package com.homenest;
abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;       // 🔒 Encapsulated
    protected double energyUsage;

    // Constructor → Device registration
    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        registerDevice();
    }

    // Encapsulated access
    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(deviceId + " turned OFF");
    }

    // Operator usage (*)
    public double calculateEnergy(double hours) {
        return energyUsage * hours;
    }

    // Device registration
    private void registerDevice() {
        System.out.println("Device registered: " + deviceId);
    }

    // 🔐 Secured firmware logs
    protected void firmwareUpdateLog(String message) {
        System.out.println("[Firmware Log] " + message);
    }

    // Polymorphic behavior
    public abstract void reset();
}
