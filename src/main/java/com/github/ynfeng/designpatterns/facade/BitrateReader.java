package com.github.ynfeng.designpatterns.facade;

import java.io.File;

public class BitrateReader {
    public static String read(File file, String sourceCodec) {
        System.out.println("读取比特率");
        return "";
    }

    public static String convert(String bitrate, Codec destinationCodec) {
        System.out.println("比特率转换");
        return "";
    }
}
