package com.homenest;
class Light extends Device {

    public Light(String id) {
        super(id, 5);
    }

    @Override
    public void reset() {
        turnOff();
        firmwareUpdateLog("Light brightness reset");
    }
}
