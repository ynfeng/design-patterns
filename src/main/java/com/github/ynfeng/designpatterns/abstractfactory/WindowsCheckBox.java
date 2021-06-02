package com.github.ynfeng.designpatterns.abstractfactory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("windows check box checked.");
    }
}
