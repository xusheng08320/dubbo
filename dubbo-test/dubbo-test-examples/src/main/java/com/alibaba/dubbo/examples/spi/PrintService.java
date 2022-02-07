package com.alibaba.dubbo.examples.spi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("impl")
public interface PrintService {

    void printInfo();
}
