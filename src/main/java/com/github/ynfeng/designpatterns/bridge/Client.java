package com.github.ynfeng.designpatterns.bridge;

public class Client {

    public static void main(String[] args) {
        Device tv = new TV();
        AdvanceRemoteControl remoteControl = new AdvanceRemoteControl(tv);
        remoteControl.togglePower();
        System.out.println(tv.isEnabled());
        remoteControl.togglePower();
        System.out.println(tv.isEnabled());
    }
}
