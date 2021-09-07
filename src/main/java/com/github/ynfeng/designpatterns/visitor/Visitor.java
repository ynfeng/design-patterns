package com.github.ynfeng.designpatterns.visitor;

public interface Visitor {
    void visit(Dot dot);

    void visit(Circle circle);

    void visit(Rectangle rectangle);
}
