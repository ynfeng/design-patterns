package com.github.ynfeng.designpatterns.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
