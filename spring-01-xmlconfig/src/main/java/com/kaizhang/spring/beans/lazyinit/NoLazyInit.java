package com.kaizhang.spring.beans.lazyinit;

/**
 * 懒加载
 *
 * @author kaizhang
 * @date 2021-04-07 22:37
 */
public class NoLazyInit {
    public NoLazyInit() {
        System.out.println("当启动时就被加载--非懒加载");
    }
}
