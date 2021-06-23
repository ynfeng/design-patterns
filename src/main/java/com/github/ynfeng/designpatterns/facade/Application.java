package com.github.ynfeng.designpatterns.facade;

import java.io.File;

public class Application {

    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        File mp4 = converter.convert("funny-cats-video.ogg", "mp4");
    }
}
