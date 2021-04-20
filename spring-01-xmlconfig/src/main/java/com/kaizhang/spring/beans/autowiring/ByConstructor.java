package com.kaizhang.spring.beans.autowiring;

/**
 * @author kaizhang
 * @date 2021-04-21 1:09
 */
public class ByConstructor {
    public ByConstructor() {
        System.out.println("我是ByConstructor构造函数");
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ByConstructor{" +
                "name='" + name + '\'' +
                '}';
    }
}
