package com.github.ynfeng.designpatterns.abstractfactory;

public class WindowButton implements Button {
    @Override
    public void click() {
        System.out.println("windows button clicked.");
    }
}
