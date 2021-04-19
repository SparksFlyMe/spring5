package com.kaizhang.spring.beans.dependson;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author kaizhang
 * @date 2021-04-19 23:48
 */
public class MainTest {
    @Test
    public void dependsOnTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dependsOn.xml");
        System.out.println("======初始化完毕");
        BeanOne beanOne = applicationContext.getBean("beanOne", BeanOne.class);
    }
}
