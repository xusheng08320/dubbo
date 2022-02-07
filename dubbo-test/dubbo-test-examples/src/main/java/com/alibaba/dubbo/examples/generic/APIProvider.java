package com.alibaba.dubbo.examples.generic;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.examples.generic.api.IUserService;
import com.alibaba.dubbo.examples.generic.impl.UserServiceImpl;

import java.util.concurrent.CountDownLatch;

public class APIProvider {

    public static void main(String[] args) throws InterruptedException {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("my-demo");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");

        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        protocolConfig.setThreads(200);

        ServiceConfig<IUserService> serviceConfig = new ServiceConfig<IUserService>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setInterface(IUserService.class);
        serviceConfig.setRef(new UserServiceImpl());
        serviceConfig.export();

        new CountDownLatch(1).await();
    }
}
