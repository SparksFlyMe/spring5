package com.kaizhang.spring.beans.autowiringwithprimary;

import com.kaizhang.spring.beans.common.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author kaizhang
 * @date 2021-05-18 22:07
 */
@Configuration
public class PrimaryConfiguration {

    /**
     * 当有多个相同名称bean时，通过@Primary注解，来优选选择哪一个bean
     *
     * @return
     */
    @Bean
    @Primary
    public AutowiringWithPrimary firstStudent() {
        return new AutowiringWithPrimary("firstPrimary");
    }

    @Bean
    public AutowiringWithPrimary secondStudent() {
        return new AutowiringWithPrimary("secondPrimary");
    }
}