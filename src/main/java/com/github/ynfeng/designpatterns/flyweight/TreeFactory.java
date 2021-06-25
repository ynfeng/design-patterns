package com.github.ynfeng.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private final Map<String, TreeType> treeTypes = new HashMap<>();

    public TreeType getTreeType(String name, String color, String texture) {
        return treeTypes.computeIfAbsent(texture, key -> new TreeType(name, color, texture));
    }
}
