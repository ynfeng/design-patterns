package com.github.ynfeng.designpatterns.composite;

public class Circle extends Dot {
    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        System.out.println(String.format("move circle to (%d,%d).", x, y));
    }

    @Override
    public void draw() {
        System.out.println(String.format("draw circle at (%d,%d) radius %d", x, y, radius));
    }
}
