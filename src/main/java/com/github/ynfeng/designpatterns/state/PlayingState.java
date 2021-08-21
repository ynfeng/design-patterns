package com.github.ynfeng.designpatterns.state;

public class PlayingState implements State {
    private final AudioPlayer player;

    public PlayingState(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void clickLock() {
        player.changeState(new LockState(player));
    }

    @Override
    public void clickPlay() {
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
