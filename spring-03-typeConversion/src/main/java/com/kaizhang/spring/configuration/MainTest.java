package com.kaizhang.spring.configuration;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.format.support.FormattingConversionService;

import java.time.LocalDate;

/**
 * @author kaizhang
 * @date 2021-07-10 13:45
 */
public class MainTest {
    @Test
    public void test() {
        Log log = LogFactory.get();
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(GlobalDateTimeFormatConfiguration.class);
        LocalDate now = LocalDate.now();
        log.info("转换前：{}", now);
        FormattingConversionService bean = ac.getBean(FormattingConversionService.class);
        String convert = bean.convert(now, String.class);
        log.info("转换后：{}", convert);
    }
}
