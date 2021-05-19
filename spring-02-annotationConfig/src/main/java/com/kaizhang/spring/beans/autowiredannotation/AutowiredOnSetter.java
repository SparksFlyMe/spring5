package com.kaizhang.spring.beans.autowiredannotation;

import com.kaizhang.spring.beans.common.Student;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 隐式注入：通过setter方法注入
 *
 * @author kaizhang
 * @date 2021-05-16 16:18
 */
public class AutowiredOnSetter {
    private Student student;

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "AutowiredOnSetter{" +
                "student=" + student +
                '}';
    }
}
