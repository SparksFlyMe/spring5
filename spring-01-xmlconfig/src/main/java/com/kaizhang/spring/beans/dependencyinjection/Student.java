package com.kaizhang.spring.beans.dependencyinjection;

/**
 * @author kaizhang
 * @date 2021-04-02 20:44
 */
public class Student {

    private String name;

    private Integer age;

    public Student() {
        System.out.println("====student");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
