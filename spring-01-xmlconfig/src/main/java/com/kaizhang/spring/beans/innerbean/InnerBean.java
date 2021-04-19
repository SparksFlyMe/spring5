package com.kaizhang.spring.beans.innerbean;

/**
 * 内部bean：当希望一个bean只被某一个类使用时，我们可以使用内部bean
 *
 * @author kaizhang
 * @date 2021-04-19 21:42
 */
public class InnerBean {
    private String age;

    @Override
    public String toString() {
        return "InnerBean{" +
                "age='" + age + '\'' +
                '}';
    }

    public void setAge(String age) {
        this.age = age;
    }
}
