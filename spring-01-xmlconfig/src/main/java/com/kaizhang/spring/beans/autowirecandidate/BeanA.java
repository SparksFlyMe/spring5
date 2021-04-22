package com.kaizhang.spring.beans.autowirecandidate;

/**
 * @author kaizhang
 * @date 2021-04-21 20:44
 */
public class BeanA {
    public BeanA() {
        System.out.println("BeanA");
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                '}';
    }
}
