package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.ClassDemoService;
import org.apache.dubbo.demo.MyReq;
import org.apache.dubbo.demo.MyRes;
import org.apache.dubbo.demo.TestMode;

public class ClassDemoServiceImpl implements ClassDemoService {
    @Override
    public MyRes query(MyReq req) {
        System.out.println(req);
        MyRes res = new MyRes();
        res.setId(123);
        res.setName("ressss");
        TestMode tm = new TestMode();
        tm.setId(334);
        tm.setType("type34334");
        res.setTestMode(tm);
        return res;
    }
}
