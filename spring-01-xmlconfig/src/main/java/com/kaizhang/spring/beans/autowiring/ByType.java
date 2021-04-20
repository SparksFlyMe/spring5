package com.kaizhang.spring.beans.autowiring;

/**
 * @author kaizhang
 * @date 2021-04-21 0:50
 */
public class ByType {
    public ByType() {
        System.out.println("我是ByType构造函数");
    }

    private String name;

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
