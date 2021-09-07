package com.github.ynfeng.designpatterns.visitor;

public class Dot implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println(String.format("move dot to %d,%d", x, y));
    }

    @Override
    public void draw() {
        System.out.println("Draw dot");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
