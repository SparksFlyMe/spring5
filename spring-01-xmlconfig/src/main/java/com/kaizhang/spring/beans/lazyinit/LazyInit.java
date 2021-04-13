package com.kaizhang.spring.beans.lazyinit;

/**
 * 懒加载
 *
 * @author kaizhang
 * @date 2021-04-07 22:37
 */
public class LazyInit {
    public LazyInit() {
        System.out.println("当调用我时我才加载--懒加载");
    }
}
