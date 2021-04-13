package com.kaizhang.spring.beans.instantiatingbean;

/**
 * 通过静态工厂方法实例化bean
 * 静态工厂方法：： 返回“本类”的实例的“静态方法”
 *
 * @author kaizhang
 * @date 2021-04-09 0:12
 */
public class StaticFactoryMethodInstantiatingBean {

    /**
     * 一定不能返回为空，且要返回本对象，如果不返回本对象，在初始化时不报错，但在使用时报错
     */
    public static StaticFactoryMethodInstantiatingBean staticFactoryMethod() {
        return new StaticFactoryMethodInstantiatingBean();
    }

    /**
     * 一定不能返回为空，且要返回本对象
     */
    public static StaticFactoryMethodInstantiatingBean staticFactoryMethod2(String s) {
        return new StaticFactoryMethodInstantiatingBean();
    }
}
