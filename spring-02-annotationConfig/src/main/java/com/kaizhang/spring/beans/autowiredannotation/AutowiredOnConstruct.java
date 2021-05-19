package com.kaizhang.spring.beans.autowiredannotation;

import com.kaizhang.spring.beans.common.Student;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 隐式注入：通过构造函数注入
 *
 * @author kaizhang
 * @date 2021-05-16 16:19
 */
public class AutowiredOnConstruct {

    private Student student;

    /**
     * 这里这个@Autowired注解可以省略
     * 从 Spring Framework 4.3开始，如果目标 bean 从一开始就只定义一个构造函数，那么在这样的构造函数上就不再需要@autowired 注释了。
     * 但是，如果有多个构造函数可用，而且没有主/默认构造函数，那么至少其中一个构造函数必须注释为@autowired，以便指示容器使用哪个构造函数。
     */
    @Autowired
    public AutowiredOnConstruct(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "AutowiredOnConstruct{" +
                "student=" + student +
                '}';
    }
}
