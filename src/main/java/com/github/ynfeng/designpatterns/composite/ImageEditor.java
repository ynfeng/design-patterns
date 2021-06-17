package com.github.ynfeng.designpatterns.composite;

import java.util.Arrays;
import java.util.List;

public class ImageEditor {
    private final CompoundGrahpic all = new CompoundGrahpic();

    void load() {
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 0));
    }

    void groupSelected(List<Graphic> components) {
        CompoundGrahpic group = new CompoundGrahpic();
        for (Graphic graphic : components) {
            group.add(graphic);
            all.remove(graphic);
        }
        all.add(group);
        all.draw();
    }

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.load();
        editor.groupSelected(Arrays.asList(
            new Dot(5, 2),
            new Dot(1, 2),
            new Circle(4, 5, 10)));
    }
}
