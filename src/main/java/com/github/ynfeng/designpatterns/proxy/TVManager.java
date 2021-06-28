package com.github.ynfeng.designpatterns.proxy;

public class TVManager {

    public static void main(String[] args) {
        ThirdPartyTVLib thirdPartyTV = new ThirdPartyTVClass();
        ThirdPartyTVLib cachedTV = new CachedTVClass(thirdPartyTV);

        cachedTV.listVideos();
        cachedTV.getVideoInfo("1");
        cachedTV.downloadVideo("1");
        cachedTV.downloadVideo("2");
        cachedTV.downloadVideo("1");
    }
}
