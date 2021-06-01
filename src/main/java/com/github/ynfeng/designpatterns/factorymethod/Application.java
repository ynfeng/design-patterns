package com.github.ynfeng.designpatterns.factorymethod;

public class Application {

    public static void main(String[] args) {
        Dialog dialog = new WebDialog();
        dialog.render();

        dialog = new WindowsDialog();
        dialog.render();
    }
}
