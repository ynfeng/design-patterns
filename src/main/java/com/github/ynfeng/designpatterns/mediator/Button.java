package com.github.ynfeng.designpatterns.mediator;

public class Button implements Component {
    private final Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void click() {
        mediator.notify(this, "click");
    }

    @Override
    public void keypress() {
        mediator.notify(this, "keypress");
    }
}
