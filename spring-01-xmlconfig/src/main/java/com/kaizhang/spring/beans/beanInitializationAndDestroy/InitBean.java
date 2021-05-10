package com.kaizhang.spring.beans.beanInitializationAndDestroy;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * 在 bean 初始化后完成后执行定制化的操作
 * 执行顺序分别为
 * ①、利用@PostConstruct注解
 * ②、实现InitializingBean重写afterPropertiesSet方法
 * ③、通过配置xml的init-method
 *
 * @author kaizhang
 * @date 2021-05-10 23:27
 */
public class InitBean implements InitializingBean {
    public InitBean() {
        System.out.println("无参构造函数完毕，bean实例化完成");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("实现InitializingBean，重写afterPropertiesSet方法");
    }

    public void initByXmlConfig() {
        System.out.println("通过配置xml的init-method");
    }

    @PostConstruct
    public void initByPostConstruct() {
        System.out.println("通过@PostConstruct注解");
    }
}
