package com.github.ynfeng.designpatterns.protopyte;

public abstract class Shape {
    public int x;
    public int y;
    public int color;

    public Shape() {
    }

    public Shape(Shape source) {
        x = source.x;
        y = source.y;
        color = source.color;
    }

    public abstract Shape clone();
}
