package com.github.ynfeng.designpatterns.abstractfactory;

public class Application {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.click();
        checkBox.check();

        factory = new MacFactory();
        button = factory.createButton();
        checkBox = factory.createCheckBox();
        button.click();
        checkBox.check();
    }
}
