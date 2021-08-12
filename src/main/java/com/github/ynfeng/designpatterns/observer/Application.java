package com.github.ynfeng.designpatterns.observer;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor("test.txt");
        editor.subscribe("open", fileName -> System.out.println("有人打开了文件," + fileName));
        editor.subscribe("save", fileName -> System.out.println("有人修改了文件," + fileName));
        editor.openFile();
        editor.saveFile();
    }
}
