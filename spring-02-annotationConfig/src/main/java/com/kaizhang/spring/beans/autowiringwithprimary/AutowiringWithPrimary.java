package com.kaizhang.spring.beans.autowiringwithprimary;

/**
 * @author kaizhang
 * @date 2021-05-18 22:34
 */
public class AutowiringWithPrimary {
    private String value;

    public AutowiringWithPrimary(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AutowiringWithPrimary{" +
                "value='" + value + '\'' +
                '}';
    }
}
