package com.alibaba.dubbo.examples.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;

public class ProtocolTest {

    public static void main(String[] args) {
        /*Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        System.out.println(protocol);*/

        com.alibaba.dubbo.common.compiler.Compiler adaptiveExtension = ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.common.compiler.Compiler.class).getAdaptiveExtension();
        System.out.println(adaptiveExtension);
    }
}
