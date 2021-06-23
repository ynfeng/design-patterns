package com.github.ynfeng.designpatterns.facade;

import java.io.File;

public class CodecFactory {
    public String extract(File file) {
        System.out.println("提取原始编码");
        return "";
    }
}
