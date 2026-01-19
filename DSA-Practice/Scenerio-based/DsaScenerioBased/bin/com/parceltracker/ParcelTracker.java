package com.parceltracker;
public class ParcelTracker {
    public static void main(String[] args) {

        ParcelRoute route = new ParcelRoute();

        route.trackParcel();

        System.out.println("\nAdding custom checkpoint...");
        route.addCheckpoint("Shipped", "Customs Check");
        route.trackParcel();

        System.out.println("\nSimulating lost parcel...");
        route.markParcelLost();
        route.trackParcel();
    }
}
