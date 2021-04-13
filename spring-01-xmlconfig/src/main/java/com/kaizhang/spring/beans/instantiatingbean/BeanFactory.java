package com.kaizhang.spring.beans.instantiatingbean;

/**
 * bean工厂
 *
 * @author kaizhang
 * @date 2021-04-12 23:33
 */
public class BeanFactory {
    public StaticFactoryMethodInstantiatingBean getStaticFactoryMethodInstantiatingBean() {
        return StaticFactoryMethodInstantiatingBean.staticFactoryMethod();
    }

    public InstantiatingBean getInstantiatingBean() {
        return new InstantiatingBean();
    }


    public InstantiatingBean getInstantiatingBean2(String s) {
        return new InstantiatingBean();
    }
}
