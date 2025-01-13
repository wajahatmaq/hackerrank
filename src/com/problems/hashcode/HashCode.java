package com.problems.hashcode;

import java.util.ArrayList;

public class HashCode {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");
        User user3 = new User(1, "Charlie"); // Duplicate userId

        addUserToList(users, user1);
        addUserToList(users, user2);
        addUserToList(users, user3); // Should not be added because of duplicate userId

        System.out.println(users); // Should print only Alice and Bob
    }

    public static void addUserToList(ArrayList<User> users, User user) {
        if (!users.contains(user)) { // Check for duplicate userId using equals()
            users.add(user);
            System.out.println("Added: " + user);
        } else {
            System.out.println("Duplicate userId found, not added: " + user);
        }
    }
}
