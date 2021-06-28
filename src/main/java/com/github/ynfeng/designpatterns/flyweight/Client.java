package com.github.ynfeng.designpatterns.flyweight;

public class Client {

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(0, 0, "tree1", "black", "3dt");
        forest.plantTree(0, 1, "tree2", "black", "3dt");
        forest.plantTree(0, 2, "tree3", "black", "3dt");
        forest.plantTree(0, 3, "tree4", "black", "3dt");
        forest.plantTree(0, 4, "tree5", "black", "3dt");

        forest.draw();
    }
}
