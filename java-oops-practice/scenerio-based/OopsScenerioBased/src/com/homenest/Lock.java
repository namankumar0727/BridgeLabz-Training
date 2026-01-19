package com.homenest;
class Lock extends Device {

    public Lock(String id) {
        super(id, 2);
    }

    @Override
    public void reset() {
        turnOff();
        firmwareUpdateLog("Lock security reset");
    }
}
