package com.artify;
class PrintArt extends Artwork implements IPurchasable {

    PrintArt(String title, String artist, double price, String licenseType, boolean hasPreview) {
        super(title, artist, price, licenseType, hasPreview);
    }

    @Override
    public void purchase(User user) {
        if (user.walletBalance >= price) {
            user.walletBalance -= price;
            System.out.println(user.name + " purchased print art: " + title);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void license() {
        System.out.println("Print Art License: " + licenseType + " (One-time physical print)");
    }
}
