package com.github.ynfeng.designpatterns.command;

public class PasteCommand extends Command {
    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    void execute() {
        saveBackup();
        editor.replaceSelection(application.clipboard);
    }
}
