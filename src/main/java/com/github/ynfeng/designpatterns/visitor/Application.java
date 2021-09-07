package com.github.ynfeng.designpatterns.visitor;

public class Application {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Dot dot = new Dot();
        Rectangle rectangle = new Rectangle();

        Visitor visitor = new XMLExportVisitor();
        visitor.visit(circle);
        visitor.visit(dot);
        visitor.visit(rectangle);
    }
}
