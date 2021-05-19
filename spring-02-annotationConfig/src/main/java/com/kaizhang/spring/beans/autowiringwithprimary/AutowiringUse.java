package com.kaizhang.spring.beans.autowiringwithprimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * 注入autowiringWithPrimary bean，两个相同名称的bean取得是第一个，因为加了@Primary注解{@link PrimaryConfiguration#firstStudent()}
 *
 * @author kaizhang
 * @date 2021-05-18 22:57
 */
@Configuration
public class AutowiringUse {
    @Autowired
    private AutowiringWithPrimary autowiringWithPrimary;


    @Override
    public String toString() {
        return "AutowiringUse{" +
                "autowiringWithPrimary=" + autowiringWithPrimary +
                '}';
    }
}
