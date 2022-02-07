package com.alibaba.dubbo.examples.spi;

public class PrintServiceImpl implements PrintService {
    @Override
    public void printInfo() {
        System.out.println("PrintServiceImpl");
    }
}
