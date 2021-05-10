package com.kaizhang.spring.beans.beanInitializationAndDestroy;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

/**
 * 在bean销毁前执行的操作，例如释放资源等
 * 执行顺序分别为
 * ①、利用@PreDestroy
 * ②、实现DisposableBean，重写destroy方法
 * ③、通过配置xml的destroy-method
 *
 * @author kaizhang
 * @date 2021-05-11 0:11
 */
public class DestroyBean implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("通过实现DisposableBean，重写destroy方法");
    }

    public void destroyByXmlConfig() {
        System.out.println("通过配置xml的destroy-method");
    }


    @PreDestroy
    public void destroyByPreDestroy() {
        System.out.println("通过@PreDestroy");
    }
}
