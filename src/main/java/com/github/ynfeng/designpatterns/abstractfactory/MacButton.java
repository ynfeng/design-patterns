package com.github.ynfeng.designpatterns.abstractfactory;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("mac button clicked.");
    }
}
