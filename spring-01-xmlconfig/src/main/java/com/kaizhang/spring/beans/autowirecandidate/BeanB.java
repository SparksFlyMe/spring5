package com.kaizhang.spring.beans.autowirecandidate;

/**
 * @author kaizhang
 * @date 2021-04-21 20:46
 */
public class BeanB {
    private BeanA beanA;

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "beanA=" + beanA +
                '}';
    }
}
