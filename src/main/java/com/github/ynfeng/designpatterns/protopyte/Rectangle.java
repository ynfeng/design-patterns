package com.github.ynfeng.designpatterns.protopyte;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public Rectangle(Rectangle source) {
        super(source);
        width = source.width;
        height = source.height;
    }
}
