package org.apache.dubbo.common.extension.support;

public class PrintServiceImpl implements PrintService{
    @Override
    public void printInfo() {
        System.out.println("printInfo impl");
    }
}
