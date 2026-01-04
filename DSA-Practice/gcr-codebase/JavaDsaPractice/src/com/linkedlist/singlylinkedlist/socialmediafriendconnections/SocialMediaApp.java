package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaApp {
    public static void main(String[] args) {

        SocialMediaApp sm = new SocialMediaApp();

        sm.addUser(1, "Amit", 21);
        sm.addUser(2, "Neha", 22);
        sm.addUser(3, "Rahul", 23);
        sm.addUser(4, "Priya", 21);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        sm.displayFriends(1);

        System.out.println();
        sm.findMutualFriends(1, 2);

        System.out.println();
        sm.countFriends();

        System.out.println("\nSearch by Name:");
        sm.searchByName("Rahul");

        System.out.println("\nRemove Friend Connection (1 & 3):");
        sm.removeFriendConnection(1, 3);
        sm.displayFriends(1);
    }
}

