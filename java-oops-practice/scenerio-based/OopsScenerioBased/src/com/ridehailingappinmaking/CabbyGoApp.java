package com.ridehailingappinmaking;

public class CabbyGoApp {
    public static void main(String[] args) {

        Vehicle v1 = new Sedan("yewru5732y");
        Driver d1 = new Driver("Naman", "DL-987654", 4.8);

        IRideService ride = new RideService(v1, d1);

        ride.bookRide(12.5);   // distance in km
        ride.endRide();
    }
}
