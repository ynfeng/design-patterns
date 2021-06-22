package com.github.ynfeng.designpatterns.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    protected CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        System.out.println("压缩数据");
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        System.out.println("解压数据");
        return data;
    }
}
