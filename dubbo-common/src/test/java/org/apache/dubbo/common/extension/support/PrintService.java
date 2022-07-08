package org.apache.dubbo.common.extension.support;

import org.apache.dubbo.common.extension.SPI;

@SPI("impl")
public interface PrintService {
    void printInfo();
}
