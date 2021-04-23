package com.kaizhang.spring.beans.lookupmethodinjection;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 假设一个单例模式的bean A需要引用另外一个非单例模式的bean B作为属性，为了在我们每次引用的时候都能拿到最新的bean B，我们可以让bean A通过实现ApplicationContextWare
 * 来感知applicationContext（即可以获得容器上下文），从而能在运行时通过ApplicationContext.getBean(String beanName)的方法来获取最新的bean B。
 * 但是如果用ApplicationContextAware接口，就让我们与Spring代码耦合了，违背了反转控制原则（IoC，即bean完全由Spring容器管理，我们自己的代码只需要用bean就可以了）。
 * 所以Spring为我们提供了方法注入的方式来实现以上的场景。方法注入方式主要是通过<lookup-method/>标签。
 *
 * @author kaizhang
 * @date 2021-04-22 23:22
 */
public class MainTest {


    /**
     * lookup-method实现方式说明：
     * <bean class="beanClass">
     * <lookup-method name="method" bean="non-singleton-bean"/>
     * </bean>
     *
     * method是beanClass中的一个方法，beanClass和method是不是抽象都无所谓，不会影响CGLIB的动态代理，根据项目实际需求去定义。
     * non-singleton-bean指的是lookup-method中bean属性指向的必须是一个非单例模式的bean，当然如果不是也不会报错，只是每次得到的都是
     * 相同引用的bean（同一个实例），这样用lookup-method就没有意义了。
     *
     * 另外对于method在代码中的签名有下面的标准：
     * <public|protected> [abstract] <return-type> theMethodName(no-arguments);
     * public|protected要求方法必须是可以被子类重写和调用的；
     * abstract可选，如果是抽象方法，CGLIB的动态代理类就会实现这个方法，如果不是抽象方法，就会覆盖这个方法，所以没什么影响；
     * return-type就是non-singleton-bean的类型咯，当然可以是它的父类或者接口。
     * no-arguments不允许有参数。
     */
    @Test
    public void lookupMethodInjectionTest() {
        ApplicationContext app = new ClassPathXmlApplicationContext("lookupMethodInjection.xml");
        FruitPlate fp1 = (FruitPlate) app.getBean("fruitPlate1");
        Fruit fruit1 = fp1.getFruit();
        Fruit fruit2 = fp1.getFruit();
        // 下面结果为false，因为apple bean的 scope="prototype"
        System.out.println(fruit1.equals(fruit2));
        FruitPlate fp2 = (FruitPlate) app.getBean("fruitPlate2");
        fp2.getFruit();

        /**
         * 示例说明：
         *
         * 从上面例子我们可以看到，在代码中，我们没有用到Spring的任何类和接口，实现了与Spring代码的耦合。
         * 其中，最为核心的部分就是lookup-method的配置和FruitPlate.getFruit()方法。上面代码中，我们可以看到getFruit()方法是个抽象方法，
         * 我们并没有实现它啊，那它是怎么拿到水果的呢。这里的奥妙就是Spring应用了CGLIB（动态代理）类库。Spring在初始化容器的时候对配置
         * <lookup-method/>的bean做了特殊处理，Spring会对bean指定的class做动态代理，代理<lookup-method/>标签中name属性所指定的方法，
         * 返回bean属性指定的bean实例对象。每次我们调用fruitPlate1或者fruitPlate2这2个bean的getFruit()方法时，其实是调用了CGLIB生成的
         * 动态代理类的方法
         */

    }

    @Test
    public void lookupMethodInjection1Test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("lookupMethodInjection.xml");
        B b = app.getBean("b", B.class);
        B b2 = app.getBean("b", B.class);
        System.out.println((b == b2) + "===因为b是单例的，所以为true");
        // 在B中引入A，虽然bean a 的 scope="prototype" ，因为bean b是单例的，所以下面结果为true
        System.out.println((b.getA() == b2.getA()) + "===bean a 的 scope=\"prototype\" ，因为bean b是单例的，所以获得的a是相同对象，结果为true");

        B c = app.getBean("c", B.class);
        B c2 = app.getBean("c", B.class);
        System.out.println((c == c2) + "===因为c是单例的，所以为true");
        // 在B中引入A，通过lookup Method使得每次获得的a是不同对象，结果为false
        System.out.println((c.getA() == c2.getA()) + "===通过lookup Method使得每次获得的a是不同对象，结果为false");
    }

    @Test
    public void lookupMethodInjection2Test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("lookupMethodInjection.xml");
        D d = app.getBean("d", D.class);
        D d2 = app.getBean("d", D.class);
        System.out.println((d.equals(d2)) + "===因为d是单例的，所以为true");
        System.out.println((d.getDifferentA().equals(d2.getDifferentA())) + "===通过lookup Method使得每次获得的a是不同对象，结果为false");
    }
}
