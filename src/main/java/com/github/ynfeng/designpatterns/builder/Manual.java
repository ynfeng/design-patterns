package com.github.ynfeng.designpatterns.builder;

public class Manual {
    public void setSeats(int seats) {
        System.out.println(String.format("%d个座位的说明", seats));
    }

    public void setEngine(String engine) {
        System.out.println(String.format("%s引擎说明", engine));
    }

    public void setTripComputer(String tripComputer) {
        System.out.println(String.format("%s行车电脑说明", tripComputer));
    }

    public void setGps(String gps) {
        System.out.println(String.format("%sGPS使用说明", gps));
    }
}
