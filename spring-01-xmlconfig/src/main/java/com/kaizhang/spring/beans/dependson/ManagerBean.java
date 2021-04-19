package com.kaizhang.spring.beans.dependson;

/**
 * @author kaizhang
 * @date 2021-04-19 23:42
 */
public class ManagerBean {
    public ManagerBean() {
        System.out.println("我是懒加载ManagerBean，看到我说明我已经被加载了");
    }
}
