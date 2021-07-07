package com.github.ynfeng.designpatterns.iterator;

public class Profile {
    private final String id;
    private final String email;

    public Profile(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
