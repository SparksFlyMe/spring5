package com.kaizhang.spring.beans.lazyinit;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author kaizhang
 * @date 2021-04-08 23:57
 */
public class MainTest {
    /**
     * 懒加载
     */
    @Test
    public void lazyInitTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("lazyInit.xml");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        System.out.println("======= context把需要加载的数据加载完成");
        LazyInit lazyInitYes = context.getBean("lazyInitYes", LazyInit.class);
    }
}
