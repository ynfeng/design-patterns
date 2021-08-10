package com.github.ynfeng.designpatterns.mediator;

public interface Mediator {
    void notify(Component sender, String event);
}
