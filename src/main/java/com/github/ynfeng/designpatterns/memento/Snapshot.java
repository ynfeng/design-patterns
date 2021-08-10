package com.github.ynfeng.designpatterns.memento;

public class Snapshot {
    private final int x;
    private final int y;
    private final String text;

    public Snapshot(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getText() {
        return text;
    }
}
