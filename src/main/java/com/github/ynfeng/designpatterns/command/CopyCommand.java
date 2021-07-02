package com.github.ynfeng.designpatterns.command;

public class CopyCommand extends Command {
    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    void execute() {
        application.clipboard = editor.getSelection();
    }
}
