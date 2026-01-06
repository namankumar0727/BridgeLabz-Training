package com.eventease;
/* Interface for scheduling-related operations */
interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
