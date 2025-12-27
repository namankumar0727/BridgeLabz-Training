package com.constructor.levelone;

public class UseHotelBooking {


	    public static void main(String[] args) {

	        // Default booking
	        HotelBooking b1 = new HotelBooking();
	        b1.displayBooking();

	        // Parameterized booking
	        HotelBooking b2 = new HotelBooking("Naman", "Deluxe", 3);
	        b2.displayBooking();

	        // Copy booking
	        HotelBooking b3 = new HotelBooking(b2);
	        b3.displayBooking();
	    }
	}
