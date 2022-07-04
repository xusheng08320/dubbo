package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.MyDemoService;

/**
 * @Author xusheng
 * @Date 2022/7/4 16:37
 * @Desc
 */
public class MyDemoServiceImpl implements MyDemoService {
    @Override
    public String sayHello(String name) {
        return name;
    }

    @Override
    public String sayHello(int i) {
        return String.valueOf(i);
    }
}
