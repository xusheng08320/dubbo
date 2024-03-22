package org.apache.dubbo.demo;

import java.io.Serializable;

public class MyRes implements Serializable {

    private Integer id;

    private String name;

    private TestMode testMode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestMode getTestMode() {
        return testMode;
    }

    public void setTestMode(TestMode testMode) {
        this.testMode = testMode;
    }

    @Override
    public String toString() {
        return "MyRes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testMode=" + testMode +
                '}';
    }
}
