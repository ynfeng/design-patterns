package com.github.ynfeng.designpatterns.proxy;

public class ThirdPartyTVClass implements ThirdPartyTVLib {
    @Override
    public String listVideos() {
        System.out.println("list videos");
        return "";
    }

    @Override
    public String getVideoInfo(String id) {
        System.out.println("get video info " + id);
        return "";
    }

    @Override
    public void downloadVideo(String id) {
        System.out.println("download video " + id);
    }
}
