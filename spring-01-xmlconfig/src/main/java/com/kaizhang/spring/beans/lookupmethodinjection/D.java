package com.kaizhang.spring.beans.lookupmethodinjection;

public abstract class D {
    /**
     * 因为bean d是单例的，bean a 是原型的，要每次都需要返回不同A对象，则需要定义一个
     * @return
     */
    public abstract A getDifferentA();
}
