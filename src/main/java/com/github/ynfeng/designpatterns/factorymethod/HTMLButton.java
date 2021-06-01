package com.github.ynfeng.designpatterns.factorymethod;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Html button show.");
    }

    @Override
    public void onClick() {
        System.out.println("Html button click.");
    }
}
