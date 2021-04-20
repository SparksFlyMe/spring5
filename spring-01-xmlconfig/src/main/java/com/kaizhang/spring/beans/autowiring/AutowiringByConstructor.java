package com.kaizhang.spring.beans.autowiring;

/**
 * @author kaizhang
 * @date 2021-04-20 22:58
 */
public class AutowiringByConstructor {
    private ByConstructor byConstructor;
    private ByType byType;

    public AutowiringByConstructor(ByConstructor byConstructor, ByType byType) {
        this.byConstructor = byConstructor;
        this.byType = byType;
    }

    @Override
    public String toString() {
        return "AutowiringByConstructor{" +
                "byConstructor=" + byConstructor +
                ", byType=" + byType +
                '}';
    }
}
