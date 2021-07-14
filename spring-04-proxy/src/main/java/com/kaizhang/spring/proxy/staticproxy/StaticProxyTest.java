package com.kaizhang.spring.proxy.staticproxy;

import com.kaizhang.spring.beans.Host;
import com.kaizhang.spring.beans.Proxy;
import org.junit.jupiter.api.Test;

/**
 * 静态代理的好处:
 * 1、可以使得我们的真实角色更加纯粹，不再去关注一些公共的事情
 * 2、公共的业务由代理来完成，实现了业务的分工
 * 3、公共业务发生扩展时变得更加集中和方便
 * 缺点 :
 * 1、类多了，多了代理类，工作量变大了，开发效率降低
 * 我们想要静态代理的好处，又不想要静态代理的缺点，所以就有了动态代理
 *
 * @author kaizhang
 * @date 2021-07-11 16:07
 */
public class StaticProxyTest {

    @Test
    public void staticProxy() {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
