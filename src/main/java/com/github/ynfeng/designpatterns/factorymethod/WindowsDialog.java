package com.github.ynfeng.designpatterns.factorymethod;

public class WindowsDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
