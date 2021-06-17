package com.github.ynfeng.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGrahpic implements Graphic {
    private final List<Graphic> children = new ArrayList<>();

    @Override
    public void move(int x, int y) {
        children.forEach(graphic -> graphic.move(x, y));
    }

    @Override
    public void draw() {
        children.forEach(Graphic::draw);
    }

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }
}
