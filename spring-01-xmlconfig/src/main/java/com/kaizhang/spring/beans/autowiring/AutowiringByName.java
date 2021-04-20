package com.kaizhang.spring.beans.autowiring;

/**
 * @author kaizhang
 * @date 2021-04-20 22:55
 */
public class AutowiringByName {

    private Autowiring byName;

    public void setByName(Autowiring byName) {
        this.byName = byName;
    }

    @Override
    public String toString() {
        return "AutowiringByName{" +
                "byName=" + byName +
                '}';
    }
}
