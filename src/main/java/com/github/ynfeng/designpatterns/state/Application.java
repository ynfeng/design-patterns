package com.github.ynfeng.designpatterns.state;

public class Application {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.startPlayback();
        player.clickLock();
        player.clickPlay();
        player.clickLock();
        player.clickPervious();
        player.clickNext();
    }
}
