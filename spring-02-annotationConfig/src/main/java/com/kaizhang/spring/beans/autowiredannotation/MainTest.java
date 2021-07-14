package com.kaizhang.spring.beans.autowiredannotation;

import com.kaizhang.spring.beans.autowiringwithqualifiers.AutowiringWithQualifier;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Autowired与Resource注解区别；
 * Resource的作用相当于@Autowired，均可标注在字段或属性的setter方法上。
 * 不同点：
 * （1）提供方：@Autowired是由org.springframework.beans.factory.annotation.Autowired提供，换句话说就是由Spring提供；
 *            @Resource是由javax.annotation.Resource提供，即J2EE提供，需要JDK1.6及以上。
 * （2）注入方式：@Autowired只按照byType 注入；@Resource默认按byName自动注入，也提供按照byType 注入；
 * （3）属性：@Autowired按类型装配依赖对象，默认情况下它要求依赖对象必须存在，如果允许null值，可以设置它required属性为false。
 *     如果我们想使用按名称装配，可以结合@Qualifier注解一起使用。@Resource有两个重要的属性：name和type。name属性指定byName，
 *     如果没有指定name属性，当注解标注在字段上，即默认取字段的名称作为bean名称寻找依赖对象，当注解标注在属性的setter方法上，
 *     即默认取属性名作为bean名称寻找依赖对象。需要注意的是，@Resource如果没有指定name属性，并且按照默认的名称仍然找不到依赖对象时，
 *     @Resource注解会回退到按类型装配。但一旦指定了name属性，就只能按名称装配了。
 *
 * @author kaizhang
 * @date 2021-05-16 16:21
 */
@ComponentScan(includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION)},
excludeFilters = @ComponentScan.Filter(AutowiringWithQualifier.class))
public class MainTest {

    /**
     * 隐式注入：通过setter方法注入
     */
    @Test
    public void autowiredOnSetterTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationConfig.xml");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        AutowiredOnSetter bean = applicationContext.getBean(AutowiredOnSetter.class);
        // Student注入成功（输出结果student不为null）
        System.out.println(bean);
    }

    /**
     * 隐式注入：通过构造函数注入
     * 注：从 Spring Framework 4.3开始，如果目标 bean 从一开始就只定义一个构造函数，那么在这样的构造函数上就不再需要@autowired 注释了。
     * 但是，如果有多个构造函数可用，而且没有主/缺省构造函数，那么至少其中一个构造函数必须注释为@autowired，以便指示容器使用哪个构造函数。
     */
    @Test
    public void autowiredOnConstructTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationConfig.xml");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        AutowiredOnConstruct bean = applicationContext.getBean(AutowiredOnConstruct.class);
        // Student注入成功（输出结果student不为null）
        System.out.println(bean);
    }

    /**
     * 隐式注入：通过字段注入
     */
    @Test
    public void autowiredOnFieldTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationConfig.xml");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        AutowiredOnField bean = applicationContext.getBean(AutowiredOnField.class);
        // Student注入成功（输出结果student不为null）
        System.out.println(bean);
        // 这里new的对象AutowiredOnField中，student为null
        AutowiredOnField autowiredOnField = new AutowiredOnField();
        System.out.println(autowiredOnField.toString());
    }
}
