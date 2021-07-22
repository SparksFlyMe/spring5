package com.kaizhang.spring.beans;

/**
 * 中介（即代理角色）
 *
 * @author kaizhang
 * @date 2021-07-11 16:03
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
}
