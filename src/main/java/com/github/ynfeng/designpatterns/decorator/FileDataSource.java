package com.github.ynfeng.designpatterns.decorator;


public class FileDataSource implements DataSource {
    @Override
    public void writeData(String data) {
        System.out.println("写入到文件");
    }

    @Override
    public String readData() {
        System.out.println("从文件读数据");
        return "data";
    }
}
