package com.github.ynfeng.designpatterns.flyweight;

public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println(String.format("draw tree at %d,%d texture is %s.", x, y, texture));
    }
}
