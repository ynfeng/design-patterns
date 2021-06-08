package com.github.ynfeng.designpatterns.builder;

public class CarManualBuilder implements Builder<Manual> {
    private final Manual manual = new Manual();

    @Override
    public Builder<Manual> seats(int seats) {
        manual.setSeats(seats);
        return this;
    }

    @Override
    public Builder<Manual> engine(String engine) {
        manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder<Manual> tripComputer(String tripComputer) {
        manual.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder<Manual> gps(String gps) {
        manual.setGps(gps);
        return this;
    }

    @Override
    public Manual build() {
        return manual;
    }
}
