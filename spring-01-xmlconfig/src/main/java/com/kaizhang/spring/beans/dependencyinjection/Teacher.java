package com.kaizhang.spring.beans.dependencyinjection;

/**
 * @author kaizhang
 * @date 2021-04-02 21:00
 */
public class Teacher {
    private String name;

    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Teacher() {
        System.out.println("====teacher");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
