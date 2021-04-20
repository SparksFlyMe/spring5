package com.kaizhang.spring.beans.autowiring;

/**
 * @author kaizhang
 * @date 2021-04-20 22:53
 */
public class Autowiring {

    public Autowiring() {
        System.out.println("我是Autowiring构造函数");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Autowiring{" +
                "name='" + name + '\'' +
                '}';
    }
}
