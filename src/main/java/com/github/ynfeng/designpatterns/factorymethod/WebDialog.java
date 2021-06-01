package com.github.ynfeng.designpatterns.factorymethod;

public class WebDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HTMLButton();
    }
}
