package com.github.ynfeng.designpatterns.state;

public class ReadyState implements State {
    private final AudioPlayer player;

    public ReadyState(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void clickLock() {
        player.changeState(new LockState(player));
    }

    @Override
    public void clickPlay() {
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void clickNext() {
        player.nextSong();
    }

    @Override
    public void clickPrevious() {
        player.previousSong();
    }
}
