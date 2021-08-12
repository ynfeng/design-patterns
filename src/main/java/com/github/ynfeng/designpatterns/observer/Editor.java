package com.github.ynfeng.designpatterns.observer;

import java.util.HashMap;
import java.util.Map;

public class Editor implements EventManager {
    private final Map<String, EventListener> listeners = new HashMap<>();
    private final String fileName;

    public Editor(String fileName) {
        this.fileName = fileName;
    }

    public void openFile() {
        notify("open", fileName);
    }

    public void saveFile() {
        notify("save", fileName);
    }

    public void subscribe(String eventType, EventListener listener) {
        listeners.put(eventType, listener);
    }

    public void unsubscribe(String eventType) {
        listeners.remove(eventType);
    }

    public void notify(String eventType, String data) {
        EventListener eventListener = listeners.get(eventType);
        if (eventListener != null) {
            eventListener.update(data);
        }
    }
}
