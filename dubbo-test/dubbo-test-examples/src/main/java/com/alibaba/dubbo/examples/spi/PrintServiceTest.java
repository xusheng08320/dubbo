package com.alibaba.dubbo.examples.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class PrintServiceTest {

    public static void main(String[] args) {
        PrintService printService = ExtensionLoader.getExtensionLoader(PrintService.class).getExtension("impl");
        printService.printInfo();
    }

}
