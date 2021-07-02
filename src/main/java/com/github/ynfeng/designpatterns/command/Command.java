package com.github.ynfeng.designpatterns.command;

public abstract class Command {
    protected final Application application;
    protected final Editor editor;
    private String backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
    }

    protected void saveBackup() {
        backup = editor.text;
    }

    protected void undo() {
        editor.text = backup;
    }

    abstract void execute();
}
