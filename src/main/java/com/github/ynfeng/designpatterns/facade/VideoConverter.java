package com.github.ynfeng.designpatterns.facade;

import java.io.File;

public class VideoConverter {
    File convert(String fileName, String format) {
        File file = new File(fileName);
        String sourceCodec = new CodecFactory().extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        String bitrate = BitrateReader.read(file, sourceCodec);
        String result = BitrateReader.convert(bitrate, destinationCodec);
        result = new AudioMixer().fix(result);
        return new File(result);
    }
}
