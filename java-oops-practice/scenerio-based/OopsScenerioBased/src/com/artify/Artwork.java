package com.artify;
class Artwork {
    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;   // encapsulated / protected
    protected boolean hasPreview;

    // Constructor without preview
    Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = false;
    }

    // Constructor with preview
    Artwork(String title, String artist, double price, String licenseType, boolean hasPreview) {
        this(title, artist, price, licenseType);
        this.hasPreview = hasPreview;
    }
}
