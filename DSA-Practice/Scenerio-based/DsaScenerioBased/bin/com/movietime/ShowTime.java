package com.movietime;
class ShowTime {
    String movieName;
    int time; // time in minutes (e.g., 1330 for 1:30 PM)

    ShowTime(String movieName, int time) {
        this.movieName = movieName;
        this.time = time;
    }

    @Override
    public String toString() {
        int hours = time / 100;
        int minutes = time % 100;
        return movieName + " - " + String.format("%02d:%02d", hours, minutes);
    }
}
