package com.github.ynfeng.designpatterns.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public Circle(Circle source) {
        super(source);
        radius = source.radius;
    }
}
