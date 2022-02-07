package com.alibaba.dubbo.examples.generic;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.examples.generic.api.IUserService;

public class APIConsumer {

    public static void main(String[] args) {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("my-demo");
        applicationConfig.setQosPort(12345);

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");

        ReferenceConfig<IUserService> referenceConfig = new ReferenceConfig<IUserService>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(IUserService.class);

        IUserService userService = referenceConfig.get();
        IUserService.User user = userService.get(null);
        System.out.println(user);
    }
}
