package com.github.ynfeng.designpatterns.visitor;

public class XMLExportVisitor implements Visitor {
    @Override
    public void visit(Dot dot) {
        System.out.println("export dot");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("export circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("export rectanble");
    }
}
