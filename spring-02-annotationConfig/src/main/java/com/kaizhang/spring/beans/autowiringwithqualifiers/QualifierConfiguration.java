package com.kaizhang.spring.beans.autowiringwithqualifiers;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kaizhang
 * @date 2021-05-19 20:12
 */
@Configuration
public class QualifierConfiguration {

    @Bean("firstQualifier")
    public AutowiringWithQualifier getQualifierFirst() {
        return new AutowiringWithQualifier("firstQualifier");
    }

    @Bean("secondQualifier")
    public AutowiringWithQualifier getQualifierSecond() {
        return new AutowiringWithQualifier("secondQualifier");
    }
}
