package com.github.ynfeng.designpatterns.bridge;

public class AdvanceRemoteControl extends RemoteControl {
    private final Device device;

    public AdvanceRemoteControl(Device device) {
        super(device);
        this.device = device;
    }

    public void mute() {
        device.setVolume(0);
    }
}
