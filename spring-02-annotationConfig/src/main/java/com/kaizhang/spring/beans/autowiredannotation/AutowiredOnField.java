package com.kaizhang.spring.beans.autowiredannotation;

import com.kaizhang.spring.beans.common.Student;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 隐式注入：通过字段注入
 *
 * @author kaizhang
 * @date 2021-05-16 17:26
 */
public class AutowiredOnField {
    @Autowired
    private Student student;

    @Override
    public String toString() {
        return "AutowiredOnField{" +
                "student=" + student +
                '}';
    }
}
