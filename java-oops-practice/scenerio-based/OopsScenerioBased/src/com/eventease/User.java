package com.eventease;
/* Represents an event organizer */
class User {

    private String name;
    private String email; // sensitive data

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}
