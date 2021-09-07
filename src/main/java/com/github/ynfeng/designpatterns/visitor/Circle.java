package com.github.ynfeng.designpatterns.visitor;

public class Circle implements Shape {


    @Override
    public void move(int x, int y) {
        System.out.println(String.format("move circle to %d,%d", x, y));
    }

    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
