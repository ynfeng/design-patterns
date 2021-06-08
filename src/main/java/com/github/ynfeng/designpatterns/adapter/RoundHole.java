package com.github.ynfeng.designpatterns.adapter;

public class RoundHole {
    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return radius >= roundPeg.getRadius();
    }
}
