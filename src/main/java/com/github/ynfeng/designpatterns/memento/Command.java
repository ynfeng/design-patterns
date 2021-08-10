package com.github.ynfeng.designpatterns.memento;

public class Command {
    private Snapshot backup;
    private final Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void makeBackup() {
       backup = editor.createShapshot();
    }

    public void undo() {
        editor.setState(backup);
    }
}
