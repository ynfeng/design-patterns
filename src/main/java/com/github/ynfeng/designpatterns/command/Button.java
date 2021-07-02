package com.github.ynfeng.designpatterns.command;

public class Button {
    private final Application application;
    private final Command command;

    public Button(Application application, Command command) {
        this.application = application;
        this.command = command;
    }

    public void click() {
        application.executeCommand(command);
    }
}
