package com.songvault;

public class Song extends Media {

    private String duration;
    private String genre;

    public Song(String title, String artist, String duration, String genre) {
        super(title, artist);
        this.duration = duration;
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title + " | " + artist + " | " + duration + " | " + genre;
    }
}
