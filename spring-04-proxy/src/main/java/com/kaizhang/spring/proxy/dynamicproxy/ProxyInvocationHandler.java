package com.kaizhang.spring.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 核心：InvocationHandler 和 roxy
 *
 * @author kaizhang
 * @date 2021-07-11 16:17
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setObject(Object target) {
        this.target = target;
    }


    /**
     * 生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * proxy：代理类
     * method :代理类的调用处理程序的方法对象 .
     * 处理代理实例上的方法调用并返回结果
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy: " + proxy.getClass().getName());
        System.out.println("method: " + method.getName());

        return method.invoke(target, args);
    }
}
