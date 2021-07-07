package com.github.ynfeng.designpatterns.iterator;

import java.util.List;

public class WeChatProfileIterator implements ProfileIterator {
    private final List<Profile> profiles;
    private int currentIndex;

    public WeChatProfileIterator(List<Profile> profiles, String profileId) {
        this.profiles = profiles;
    }

    @Override
    public boolean hasMore() {
        return currentIndex <= profiles.size() - 1;
    }

    @Override
    public Profile getNext() {
        return profiles.get(currentIndex++);
    }
}
