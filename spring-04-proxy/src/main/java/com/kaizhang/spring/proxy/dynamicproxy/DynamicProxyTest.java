package com.kaizhang.spring.proxy.dynamicproxy;

import com.kaizhang.spring.beans.Host;
import com.kaizhang.spring.beans.Rent;
import org.junit.jupiter.api.Test;

/**
 * 动态代理
 * @author kaizhang
 * @date 2021-07-11 16:13
 */
public class DynamicProxyTest {
    @Test
    public void dynamicProxy() {
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setObject(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }

}
