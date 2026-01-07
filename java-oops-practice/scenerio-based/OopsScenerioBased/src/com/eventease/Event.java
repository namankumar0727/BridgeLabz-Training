package com.eventease;
/* Base class for all events */
abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;      // cannot be changed once assigned
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without catering/decoration
    Event(int eventId, String eventName, String location,
          String date, int attendees, double venueCost, User organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.organizer = organizer;
    }

    // Constructor with catering/decoration
    Event(int eventId, String eventName, String location,
          String date, int attendees, double venueCost,
          double serviceCost, double discount, User organizer) {

        this(eventId, eventName, location, date, attendees, venueCost, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    public void displayEventDetails() {
        System.out.println("\nEvent ID: " + eventId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
