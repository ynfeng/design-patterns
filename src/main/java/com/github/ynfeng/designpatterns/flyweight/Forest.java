package com.github.ynfeng.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();
    private final TreeFactory factory = new TreeFactory();

    void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = factory.getTreeType(name, color, texture);
        Tree tree = new Tree(type, x, y);
        trees.add(tree);
    }

    void draw() {
        trees.stream().forEach(Tree::draw);
    }
}
