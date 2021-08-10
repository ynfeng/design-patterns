package com.github.ynfeng.designpatterns.mediator;

public class Checkbox implements Component {
    private final Mediator mediator;
    private boolean checked;

    public Checkbox(Mediator mediator) {
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

    public void check() {
        if (checked) {
            checked = false;
        } else {
            checked = true;
        }
    }

    public boolean isChecked() {
        return checked;
    }
}

