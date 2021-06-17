package com.github.ynfeng.designpatterns.bridge;

public class RemoteControl {
    private final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        if (device.getVolume() > 0) {
            device.setVolume(device.getVolume() - 1);
        }
    }

    void volumeUp() {
        if (device.getVolume() < 100) {
            device.setVolume(device.getVolume() + 1);
        }
    }

    void channelDown() {
        if (device.getChannel() > 0) {
            device.setChannel(device.getChannel() - 1);
        }
    }

    void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
