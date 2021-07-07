package com.github.ynfeng.designpatterns.iterator;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println(String.format("send %s to %s", message, profile.getEmail()));
        }
    }
}
