package com.github.ynfeng.designpatterns.iterator;

public interface ProfileIterator {
    boolean hasMore();

    Profile getNext();
}
