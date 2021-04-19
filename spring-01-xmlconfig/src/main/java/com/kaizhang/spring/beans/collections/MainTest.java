package com.kaizhang.spring.beans.collections;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author kaizhang
 * @date 2021-04-19 22:23
 */
public class MainTest {
    @Test
    public void collectionsBeanTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collections.xml");
        System.out.println("======初始化完毕");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        CollectionsBean propertiesBean = applicationContext.getBean("propertiesBean", CollectionsBean.class);
        System.out.println(propertiesBean);
    }
}
