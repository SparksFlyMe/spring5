package com.kaizhang.spring.beans.instantiatingbean;

/**
 * 实例工厂方法实例化bean
 *
 * @author kaizhang
 * @date 2021-04-12 22:28
 */
public class InstanceFactoryMethodInstantiatingBean {

    public StaticFactoryMethodInstantiatingBean getStaticFactoryMethodInstantiatingBean() {
        return StaticFactoryMethodInstantiatingBean.staticFactoryMethod();
    }
}
