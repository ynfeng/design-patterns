package com.github.ynfeng.designpatterns.builder;

public class Director {

    public <T> T makeSUV(Builder<T> builder) {
        return builder
            .gps("gps for SUV")
            .seats(7)
            .engine("engine for SUV")
            .tripComputer("trip computer for SUV")
            .build();
    }

    public <T> T makeSportsCar(Builder<T> builder) {
        return builder
            .gps("gps for sports car")
            .seats(2)
            .engine("engine for sports car")
            .tripComputer("trip computer for sports car")
            .build();
    }
}
