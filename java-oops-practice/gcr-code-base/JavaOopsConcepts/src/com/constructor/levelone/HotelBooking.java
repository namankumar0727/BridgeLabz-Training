package com.constructor.levelone;

public class HotelBooking {
	public class HotelBooking {

	    String guestName;
	    String roomType;
	    int nights;

	    // Default Constructor
	    public HotelBooking() {
	        guestName = "Guest";
	        roomType = "Standard";
	        nights = 1;
	    }

	    // Parameterized Constructor
	    public HotelBooking(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }

	    // Copy Constructor
	    public HotelBooking(HotelBooking hb) {
	        this.guestName = hb.guestName;
	        this.roomType = hb.roomType;
	        this.nights = hb.nights;
	    }

	    // Method to display booking details
	    public void displayBooking() {
	        System.out.println("Guest Name : " + guestName);
	        System.out.println("Room Type  : " + roomType);
	        System.out.println("Nights     : " + nights);
	        System.out.println("------------------------");
	    }
	}

}
