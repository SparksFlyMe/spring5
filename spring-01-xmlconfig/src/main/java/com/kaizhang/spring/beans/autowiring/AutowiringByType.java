package com.kaizhang.spring.beans.autowiring;

/**
 * @author kaizhang
 * @date 2021-04-20 22:57
 */
public class AutowiringByType {
    private ByType autowiring;

    public void setAutowiring(ByType autowiring) {
        this.autowiring = autowiring;
    }

    @Override
    public String toString() {
        return "AutowiringByType{" +
                "autowiring=" + autowiring +
                '}';
    }
}
