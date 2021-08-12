package com.github.ynfeng.designpatterns.observer;

public interface EventManager {

    void subscribe(String eventType, EventListener listener);

    void unsubscribe(String eventType);

    void notify(String eventType, String data);
}
