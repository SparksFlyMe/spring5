package com.kaizhang.spring.beans.innerbean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaizhang
 * @date 2021-04-19 21:49
 */
public class MainTest {
    /**
     * 内部bean：当希望一个bean只被某一个类使用时，我们可以使用内部bean。
     * 内部 bean 总是匿名的，并且总是用外部 bean 创建的。不可能独立地访问内部 bean，也不可能将它们注入到其他 bean 中，而是注入到包围的 bean（{@link OuterBean}） 中
     * 在inner bean中，id和name不是必须的，因为他们会被容器忽略
     */
    @Test
    public void innerBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("innerBeans.xml");
        OuterBean outerBean = context.getBean("outerBean", OuterBean.class);
        System.out.println(outerBean);
    }
}
