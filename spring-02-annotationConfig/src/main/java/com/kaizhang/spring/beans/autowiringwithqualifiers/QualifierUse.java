package com.kaizhang.spring.beans.autowiringwithqualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 如果有多个相同类型的bean，可以通过@Qualifier注解来区别最终用哪个bean
 *
 * @author kaizhang
 * @date 2021-05-19 20:23
 */
@Configuration
public class QualifierUse {
    /**
     * 这里注入的就是bean名称为secondQualifier的bean
     */
    @Autowired
    @Qualifier("secondQualifier")
    private AutowiringWithQualifier autowiringWithQualifier;

    @Override
    public String toString() {
        return "QualifierUse{" +
                "autowiringWithQualifier=" + autowiringWithQualifier +
                '}';
    }
}
