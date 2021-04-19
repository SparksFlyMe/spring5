package com.kaizhang.spring.beans.idref;

import com.kaizhang.spring.beans.dependencyinjection.Common;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaizhang
 * @date 2021-04-20 0:02
 */
public class MainTest {
    /**
     * idRef
     */
    @Test
    public void idRefTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("idRef.xml");
        Common common = context.getBean("common1", Common.class);
        System.out.println(common);
    }
}
