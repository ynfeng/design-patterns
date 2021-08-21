package com.github.ynfeng.designpatterns.state;

public class LockState implements State {
    private final AudioPlayer player;

    public LockState(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void clickLock() {
        if (player.isPlaying()) {
            player.changeState(new PlayingState(player));
        } else {
            player.changeState(new ReadyState(player));
        }
    }

    @Override
    public void clickPlay() {
        //noting to do.
    }

    @Override
    public void clickNext() {
        //noting to do.
    }

    @Override
    public void clickPrevious() {
        //noting to do.
    }
}
