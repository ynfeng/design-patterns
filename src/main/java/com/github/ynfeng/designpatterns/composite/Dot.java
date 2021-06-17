package com.github.ynfeng.designpatterns.composite;

public class Dot implements Graphic {
    protected final int x;
    protected final int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println(String.format("move dot to (%d,%d)", x, y));
    }

    @Override
    public void draw() {
        System.out.println(String.format("draw dot at (%d,%d)", x, y));
    }
}
