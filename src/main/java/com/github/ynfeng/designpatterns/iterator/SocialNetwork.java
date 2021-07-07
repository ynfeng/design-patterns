package com.github.ynfeng.designpatterns.iterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCowokersIterator(String profileId);
}
