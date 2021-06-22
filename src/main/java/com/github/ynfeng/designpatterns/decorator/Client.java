package com.github.ynfeng.designpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        CompressionDecorator compressionDecorator = new CompressionDecorator(new FileDataSource());
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(compressionDecorator);
        encryptionDecorator.writeData("hello world.");
        encryptionDecorator.readData();
    }
}
