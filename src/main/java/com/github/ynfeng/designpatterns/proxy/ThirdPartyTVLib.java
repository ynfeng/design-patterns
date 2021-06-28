package com.github.ynfeng.designpatterns.proxy;

public interface ThirdPartyTVLib {
    String listVideos();

    String getVideoInfo(String id);

    void downloadVideo(String id);
}
