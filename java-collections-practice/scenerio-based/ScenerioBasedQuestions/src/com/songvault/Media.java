package com.songvault;

public abstract class Media {

    protected String title;
    protected String artist;

    public Media(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
