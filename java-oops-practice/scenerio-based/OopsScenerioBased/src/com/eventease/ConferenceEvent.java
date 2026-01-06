package com.eventease;
/* Represents a conference event */
class ConferenceEvent extends Event {

    ConferenceEvent(int eventId, String eventName, String location,
                    String date, int attendees, double venueCost,
                    double serviceCost, double discount, User organizer) {

        super(eventId, eventName, location, date,
              attendees, venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference scheduled with speakers and sessions.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("📊 Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("📊 Conference cancelled.");
    }
}
