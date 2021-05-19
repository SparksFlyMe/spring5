package com.kaizhang.spring.beans.autowiringwithqualifiers;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaizhang
 * @date 2021-05-19 20:17
 */
public class MainTest {

    @Test
    public void autowiringWithQualifierTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiringWithPrimary.xml");
        AutowiringWithQualifier bean = applicationContext.getBean("firstQualifier", AutowiringWithQualifier.class);
        System.out.println(bean);

        // 注入的是bean id 为 secondQualifier的bean
        QualifierUse bean2 = applicationContext.getBean(QualifierUse.class);
        System.out.println(bean2);
    }
}
