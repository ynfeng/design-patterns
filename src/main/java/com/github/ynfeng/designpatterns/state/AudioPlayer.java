package com.github.ynfeng.designpatterns.state;

public class AudioPlayer {
    private State state;
    private boolean isPlaying;

    public AudioPlayer() {
        state = new ReadyState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPervious() {
        state.clickPrevious();
    }

    public void startPlayback() {
        isPlaying = true;
    }

    public void stopPlayback() {
        isPlaying = false;
    }

    public void nextSong() {
        System.out.println("next song");
    }

    public void previousSong() {
        System.out.println("previous song");
    }

    public void fastForward(int time) {
        System.out.println("fast forward to " + time);
    }

    public void rewind(int time) {
        System.out.println("rewind to " + time);
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
