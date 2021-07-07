package com.github.ynfeng.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class WeChat implements SocialNetwork {
    private List<Profile> friends = new ArrayList<Profile>();
    private List<Profile> coworkers = new ArrayList<Profile>();

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new WeChatProfileIterator(friends, profileId);
    }

    @Override
    public ProfileIterator createCowokersIterator(String profileId) {
        return new WeChatProfileIterator(coworkers, profileId);
    }

    public void addFriend(Profile profile) {
        friends.add(profile);
    }

    public void addCoworker(Profile profile) {
        coworkers.add(profile);
    }
}
