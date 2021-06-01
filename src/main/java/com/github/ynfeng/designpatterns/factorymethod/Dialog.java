package com.github.ynfeng.designpatterns.factorymethod;

public abstract class Dialog {
    protected abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();
    }
}
