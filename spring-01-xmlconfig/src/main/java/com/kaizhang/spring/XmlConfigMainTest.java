package com.kaizhang.spring;


import com.kaizhang.spring.beans.Common;
import com.kaizhang.spring.beans.People;
import com.kaizhang.spring.beans.Student;
import com.kaizhang.spring.beans.Teacher;
import com.kaizhang.spring.beans.lazyinit.LazyInit;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaizhang
 * @date 2021-04-02 20:15
 */
public class XmlConfigMainTest {
    @Test
    public void beanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        Teacher teacher = context.getBean("teacher", Teacher.class);
        People people = context.getBean("people", People.class);
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(people);
    }

    /**
     * idRef
     */
    @Test
    public void idRefTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("idRef.xml");
        Common common = context.getBean("common", Common.class);
        System.out.println(common);
    }


    /**
     * 懒加载
     */
    @Test
    public void lazyInitTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("lazyInit.xml");
        System.out.println("======= context把需要加载的数据加载完成");
        LazyInit lazyInitTest = context.getBean("lazyInitTest", LazyInit.class);
    }
}
