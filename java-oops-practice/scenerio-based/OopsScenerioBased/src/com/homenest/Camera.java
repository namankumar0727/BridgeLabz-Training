package com.homenest;
class Camera extends Device {

    public Camera(String id) {
        super(id, 10);
    }

    @Override
    public void reset() {
        turnOff();
        firmwareUpdateLog("Camera memory cleared");
    }
}
