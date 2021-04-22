package com.kaizhang.spring.beans.lookupmethodinjection;

/**
 * 水果盘，可以拿到水果
 *
 * @author kaizhang
 * @date 2021-04-22 23:27
 */
public abstract class FruitPlate {

    /**
     * 抽象方法获取新鲜水果
     *
     * @return 返回水果
     */
    protected abstract Fruit getFruit();
}
