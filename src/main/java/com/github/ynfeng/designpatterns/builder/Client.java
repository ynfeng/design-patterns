package com.github.ynfeng.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        Car car = director.makeSUV(new CarBuilder());
        Manual manual = director.makeSUV(new CarManualBuilder());

        car = director.makeSportsCar(new CarBuilder());
        manual = director.makeSportsCar(new CarManualBuilder());
    }
}
