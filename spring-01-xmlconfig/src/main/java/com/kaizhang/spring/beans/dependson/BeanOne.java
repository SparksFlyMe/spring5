package com.kaizhang.spring.beans.dependson;

/**
 * @author kaizhang
 * @date 2021-04-19 23:41
 */
public class BeanOne {
    public BeanOne() {
        System.out.println("我依赖于ManagerBean");
    }
}
