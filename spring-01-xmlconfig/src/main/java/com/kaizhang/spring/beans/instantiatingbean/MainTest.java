package com.kaizhang.spring.beans.instantiatingbean;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * bean实例化的三种方式
 * 1：构造方法实例化
 * 2：静态工厂方法实例化
 * 3：实例工厂方法实例化
 *
 * @author kaizhang
 * @date 2021-04-08 23:56
 */
public class MainTest {
    /**
     * 通过构造方法实例化：有参与无参构造
     */
    @Test
    public void instantiatingBeanByConstructor() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("instantiatingBeanByConstructor.xml");
        System.out.println("实例化的bean有： " + Arrays.toString(context.getBeanDefinitionNames()));
        InstantiatingBean bean1 = context.getBean("instantiatingBeanByConstructorBean", InstantiatingBean.class);
        InstantiatingBean bean2 = context.getBean("instantiatingBeanByConstructorBean2", InstantiatingBean.class);
    }

    /**
     * 通过静态工厂方法实例化
     * 其中静态工厂方法一定不能返回空且只能返回本对象
     */
    @Test
    public void instantiatingBeanByStaticFactoryMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("instantiatingBeanByStaticFactoryMethod.xml");
        System.out.println("实例化的bean有： " + Arrays.toString(context.getBeanDefinitionNames()));
        StaticFactoryMethodInstantiatingBean bean = context.getBean("instantiatingBeanByStaticFactoryMethod", StaticFactoryMethodInstantiatingBean.class);
        StaticFactoryMethodInstantiatingBean bean2 = context.getBean("instantiatingBeanByStaticFactoryMethod2", StaticFactoryMethodInstantiatingBean.class);
    }

    /**
     * 通过实例工厂方法实例化
     * 调用“现有”bean的”非静态方法来创建新 bean
     * 一个工厂类也可以容纳多个工厂方法
     */
    @Test
    public void instantiatingBeanByInstanceFactoryMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("instantiatingBeanByInstanceFactoryMethod.xml");
        System.out.println("实例化的bean有： " + Arrays.toString(context.getBeanDefinitionNames()));
        BeanFactory bean = context.getBean("beanFactory", BeanFactory.class);
        StaticFactoryMethodInstantiatingBean bean2 = context.getBean("instantiatingBeanByInstanceFactory", StaticFactoryMethodInstantiatingBean.class);
        InstantiatingBean bean3 = context.getBean("instantiatingBeanByInstanceFactory2", InstantiatingBean.class);
        InstantiatingBean bean4 = context.getBean("instantiatingBeanByInstanceFactory3", InstantiatingBean.class);
        System.out.println(bean);
        System.out.println(bean2);
        System.out.println(bean3);
        System.out.println(bean4);
    }
}
