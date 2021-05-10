package com.kaizhang.spring.beans.beanInitializationAndDestroy;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaizhang
 * @date 2021-05-10 23:43
 */
public class MainTest {

    /**
     * 在 bean 初始化后完成后执行定制化的操作
     * 执行顺序分别为
     * ①、利用@PostConstruct注解
     * ②、实现InitializingBean重写afterPropertiesSet方法
     * ③、通过配置xml的init-method
     */
    @Test
    public void initBeanTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanInitializationAndDestroy.xml");
//        InitBean bean = applicationContext.getBean("initBean", InitBean.class);

    }

    /**
     * 在bean销毁前执行的操作，例如释放资源等
     * 执行顺序分别为
     * ①、利用@PreDestroy
     * ②、实现DisposableBean，重写destroy方法
     * ③、通过配置xml的destroy-method
     */
    @Test
    public void destroyBeanTest() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanInitializationAndDestroy.xml");
        DestroyBean bean = applicationContext.getBean("destroyBean", DestroyBean.class);
        System.out.println("准备关闭spring容器");
        applicationContext.registerShutdownHook();
    }


}
