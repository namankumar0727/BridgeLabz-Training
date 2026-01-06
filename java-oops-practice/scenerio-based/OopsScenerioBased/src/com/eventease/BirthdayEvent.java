package com.eventease;
/* Represents a birthday event */
class BirthdayEvent extends Event {

    BirthdayEvent(int eventId, String eventName, String location,
                  String date, int attendees, double venueCost,
                  double serviceCost, double discount, User organizer) {

        super(eventId, eventName, location, date,
              attendees, venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday event scheduled with cake and decorations.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("🎂 Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("🎂 Birthday event cancelled.");
    }
}
