package com.github.ynfeng.designpatterns.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    protected EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("加密数据");
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        System.out.println("解密数据");
        return data;
    }
}
