package com.artify;
class DigitalArt extends Artwork implements IPurchasable {

    DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void purchase(User user) {
        if (user.walletBalance >= price) {
            user.walletBalance -= price;   // operator usage
            System.out.println(user.name + " purchased digital art: " + title);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void license() {
        System.out.println("Digital Art License: " + licenseType + " (Download & Use)");
    }
}
