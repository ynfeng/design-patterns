package com.github.ynfeng.designpatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedTVClass implements ThirdPartyTVLib {
    private final ThirdPartyTVLib thirdPartyTVLib;
    private final Map<String, String> cache = new HashMap<>();

    public CachedTVClass(ThirdPartyTVLib thirdPartyTVLib) {
        this.thirdPartyTVLib = thirdPartyTVLib;
    }

    @Override
    public String listVideos() {
        return thirdPartyTVLib.listVideos();
    }

    @Override
    public String getVideoInfo(String id) {
        return thirdPartyTVLib.getVideoInfo(id);
    }

    @Override
    public void downloadVideo(String id) {
        if (cache.containsKey(id)) {
            System.out.println("download video " + id + " from cache.");
        } else {
            thirdPartyTVLib.downloadVideo(id);
            cache.put(id, id);
        }
    }
}
