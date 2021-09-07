package com.github.ynfeng.designpatterns.strategy;

public class StrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
