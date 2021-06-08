package com.github.ynfeng.designpatterns.adapter;

public class Client {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(10);
        RoundPeg peg = new RoundPeg(9);

        System.out.println(hole.fits(peg));

        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter pegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(pegAdapter));
    }
}
