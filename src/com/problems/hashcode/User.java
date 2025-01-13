package com.problems.hashcode;

import java.util.Objects;

public class User {

    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(userId); // hash based on userId
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same object reference
        if (obj == null || getClass() != obj.getClass()) return false; // null or not a User object
        User user = (User) obj;
        return userId == user.userId; // equality based on userId
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", name='" + name + '\'' + '}';
    }
}
