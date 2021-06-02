package com.github.ynfeng.designpatterns.abstractfactory;

public class MacCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("mac check box checked.");
    }
}
