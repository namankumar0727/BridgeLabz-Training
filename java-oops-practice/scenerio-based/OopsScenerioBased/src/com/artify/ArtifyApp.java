package com.artify;
public class ArtifyApp {
    public static void main(String[] args) {

        User user = new User("Alice", 500.0);

        IPurchasable art1 = new DigitalArt(
                "Cyber Dreams", "NeoArtist", 200.0, "Commercial"
        );

        IPurchasable art2 = new PrintArt(
                "Vintage Sketch", "ClassicArtist", 150.0, "Personal", true
        );

        art1.purchase(user);
        art1.license();

        art2.purchase(user);
        art2.license();

        System.out.println("Remaining Wallet Balance: " + user.walletBalance);
    }
}
