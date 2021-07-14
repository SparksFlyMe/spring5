package com.kaizhang.spring.beans.annotationconfig;

import com.kaizhang.spring.beans.autowiringwithprimary.AutowiringUse;
import com.kaizhang.spring.beans.autowiringwithprimary.PrimaryConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author kaizhang
 * @date 2021-05-27 0:25
 */
@Configuration
@ComponentScan("com.kaizhang.spring.beans.common")
public class MyConfiguration {

    @Test
    public void test() {
//        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
        System.out.println(Arrays.toString(ac.getBeanDefinitionNames()));

        ac.register(PrimaryConfiguration.class);
        System.out.println(Arrays.toString(ac.getBeanDefinitionNames()));
    }
}
