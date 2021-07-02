package com.github.ynfeng.designpatterns.command;

public class CutCommand extends Command {
    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    void execute() {
        saveBackup();
        application.clipboard = editor.getSelection();
        editor.deleteSelection();
    }
}
