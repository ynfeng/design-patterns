package com.github.ynfeng.designpatterns.memento;

public class Editor {
    private int x;
    private int y;
    private String text;

    public Snapshot createShapshot() {
        return new Snapshot(x, y, text);
    }

    public void setState(Snapshot backup) {
        this.x = backup.getX();
        this.y = backup.getY();
        this.text = backup.getText();
    }
}
