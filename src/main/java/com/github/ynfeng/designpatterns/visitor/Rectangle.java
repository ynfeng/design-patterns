package com.github.ynfeng.designpatterns.visitor;

public class Rectangle implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println(String.format("move rectangle to %d,%d", x, y));
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
