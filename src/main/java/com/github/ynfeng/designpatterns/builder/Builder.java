package com.github.ynfeng.designpatterns.builder;

public interface Builder<T> {

    Builder<T> seats(int seats);

    Builder<T> engine(String engine);

    Builder<T> tripComputer(String tripComputer);

    Builder<T> gps(String gps);

    T build();
}
