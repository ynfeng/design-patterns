package com.github.ynfeng.designpatterns.builder;

public class Car {
    public void setSetas(int seats) {
        System.out.println(String.format("有%d个座位", seats));
    }

    public void setEngine(String engine) {
        System.out.println(String.format("引擎型号%s", engine));
    }

    public void setTripComputer(String tripComputer) {
        System.out.println(String.format("行车电脑型号%s", tripComputer));
    }

    public void setGps(String gps) {
        System.out.println(String.format("GPS型号%s", gps));
    }
}
