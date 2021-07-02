package com.github.ynfeng.designpatterns.command;

public class Editor {
    public String text;

    public String getSelection() {
        return "selection text";
    }

    public void deleteSelection() {
        text = "";
    }

    public void replaceSelection(String clipboard) {
        text = clipboard;
    }
}
