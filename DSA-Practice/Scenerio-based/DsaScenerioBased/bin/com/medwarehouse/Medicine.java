package com.medwarehouse;
class Medicine {
    String medicineName;
    int expiryDays; // days remaining until expiry

    Medicine(String medicineName, int expiryDays) {
        this.medicineName = medicineName;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return medicineName + " | Expires in " + expiryDays + " days";
    }
}
