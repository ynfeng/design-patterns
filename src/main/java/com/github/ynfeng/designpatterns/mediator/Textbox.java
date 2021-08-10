package com.github.ynfeng.designpatterns.mediator;

public class Textbox implements Component {
    private final Mediator mediator;

    public Textbox(Mediator mediator) {
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
