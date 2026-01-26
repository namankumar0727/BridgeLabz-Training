package com.annotation.useDeprecated;
public class TestDeprecated {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        // Calling deprecated method
        api.oldFeature();

        // Calling new method
        api.newFeature();
    }
}
