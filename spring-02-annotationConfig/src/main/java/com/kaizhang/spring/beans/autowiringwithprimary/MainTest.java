package com.kaizhang.spring.beans.autowiringwithprimary;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 如果有多个相同名称的bean，利用@Primary注解来设置优先级
 *
 * @author kaizhang
 * @date 2021-05-18 22:12
 */
public class MainTest {

    @Test
    public void autowiringWithPrimary() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiringWithPrimary.xml");
        AutowiringWithPrimary bean = applicationContext.getBean(AutowiringWithPrimary.class);
        System.out.println(bean);

        // 注入的bean是firstPrimary，因为加了@Primary注解
        AutowiringUse bean2 = applicationContext.getBean(AutowiringUse.class);
        System.out.println(bean2);
    }


}
