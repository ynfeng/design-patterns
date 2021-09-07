package com.github.ynfeng.designpatterns.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyAdd());

        int result = context.executeStrategy(1, 2);
        System.out.println(result);

        context.setStrategy(new StrategySubtract());
        result = context.executeStrategy(1, 2);
        System.out.println(result);
    }
}
