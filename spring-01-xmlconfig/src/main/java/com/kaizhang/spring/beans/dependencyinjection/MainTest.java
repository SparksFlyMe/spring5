package com.kaizhang.spring.beans.dependencyinjection;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入的两种方式
 * 1：构造函数注入
 * 2：setter方法注入 其中setXxx(...)方法中，xxx就是bean 对应的id
 * 使用原则：对于强制依赖项使用构造函数，可选依赖项使用setter方法
 * Spring 团队通常提倡构造函数注入，因为它允许您将应用程序组件实现为不可变对象，并确保所需的依赖项不为空
 *
 * @author kaizhang
 * @date 2021-04-02 20:15
 */
public class MainTest {
    @Test
    public void dependencyInjectionTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencyInjection.xml");
        System.out.println("======初始化完毕");
        Student student = context.getBean("student", Student.class);
        Teacher teacher = context.getBean("teacher", Teacher.class);
        People people = context.getBean("people", People.class);
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(people);
    }
}
