package com.github.ynfeng.designpatterns.factorymethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("windows button show.");
    }

    @Override
    public void onClick() {
        System.out.println("windows button click.");
    }
}
