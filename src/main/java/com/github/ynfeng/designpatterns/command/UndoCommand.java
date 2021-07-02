package com.github.ynfeng.designpatterns.command;

public class UndoCommand extends Command {
    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    void execute() {
        application.undo();
    }
}
