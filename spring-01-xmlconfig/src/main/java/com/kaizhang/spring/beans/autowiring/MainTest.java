package com.kaizhang.spring.beans.autowiring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * bean自动装配的四种方式
 * 1、no：(默认值)不自动装配。Bean引用必须由ref元素定义。对于较大的部署，不建议更改默认设置，因为显式指定协作者可以提供更好的控制和清晰度。在某种程度上，它记录了一个系统的结构。
 * 2、byName：从Spring环境中获取目标对象时，目标对象中的属性会根据名称在整个Spring环境中查找标签的id属性值。如果有相同的，那么获取这个对象，实现关联。整个Spring环境：表示所有的spring配置文件中查找，那么id不能有重复的
 * 3、byType：从Spring环境中获取目标对象时，目标对象中的属性会根据类型在整个spring环境中查找标签的class属性值。如果有相同的，那么获取这个对象，实现关联。缺点：如果存在多个相同类型的bean对象，会出错。如果属性为单一类型的数据，那么查找到多个关联对象会发生错误。如果属性为数组或集合(泛型)类型，那么查找到多个关联对象不会发生异常。
 * 4、constructor：使用构造方法完成对象注入，其实也是根据构造方法的参数类型进行对象查找，相当于采用byType的方式
 *
 * 注意：显示装配（property和constructor-arg）会覆盖自动装配
 *
 * @author kaizhang
 * @date 2021-04-21 0:11
 */
public class MainTest {
    @Test
    public void autowiringTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring.xml");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        AutowiringByDefault autowiringByDefault = applicationContext.getBean("autowiringByDefault", AutowiringByDefault.class);
        System.out.println(autowiringByDefault);
        AutowiringByName autowiringByName = applicationContext.getBean("autowiringByName", AutowiringByName.class);
        System.out.println(autowiringByName);
        AutowiringByType autowiringByType = applicationContext.getBean("autowiringByType", AutowiringByType.class);
        System.out.println(autowiringByType);
        AutowiringByConstructor autowiringByConstructor = applicationContext.getBean("autowiringByConstructor", AutowiringByConstructor.class);
        System.out.println(autowiringByConstructor);

    }
}
