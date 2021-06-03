package com.github.ynfeng.designpatterns.builder;

public class CarBuilder implements Builder<Car> {
    private final Car car = new Car();
    @Override
    public Builder<Car> seats(int seats) {
        car.setSetas(seats);
        return this;
    }

    @Override
    public Builder<Car> engine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder<Car> tripComputer(String tripComputer) {
        car.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder<Car> gps(String gps) {
        car.setGps(gps);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
