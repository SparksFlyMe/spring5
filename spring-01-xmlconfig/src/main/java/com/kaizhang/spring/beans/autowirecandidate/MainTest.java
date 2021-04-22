package com.kaizhang.spring.beans.autowirecandidate;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * 自动注入-候选，通过设置autowire-candidate为false，从自动装配排除相应bean
 * autowire-candidate 默认值为true，即参与其他bean自动注入。属性设置为false，其他的bean在按照类型（byType）注入这个bean时，忽略当前的bean。 默认值true（不忽略）
 * 只有在主动注入类型为按照类型注入（byType）才会有此问题
 *
 * @author kaizhang
 * @date 2021-04-21 20:52
 */
public class MainTest {
    @Test
    public void autowireCandidateTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireCandidate.xml");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        BeanA beanA = applicationContext.getBean("beanA", BeanA.class);
        System.out.println(beanA);
        BeanA beanC = applicationContext.getBean("beanC", BeanA.class);
        System.out.println(beanC);
        BeanB beanB = applicationContext.getBean("beanB", BeanB.class);
        System.out.println(beanB);
    }
}
