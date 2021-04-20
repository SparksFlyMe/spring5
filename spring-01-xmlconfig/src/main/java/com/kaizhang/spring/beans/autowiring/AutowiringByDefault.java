package com.kaizhang.spring.beans.autowiring;

/**
 * @author kaizhang
 * @date 2021-04-20 22:53
 */
public class AutowiringByDefault {

    private Autowiring autowiring;

    public void setAutowiring(Autowiring autowiring) {
        this.autowiring = autowiring;
    }

    @Override
    public String toString() {
        return "AutowiringByDefault{" +
                "autowiring=" + autowiring +
                '}';
    }
}
