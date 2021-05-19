package com.kaizhang.spring.beans.autowiringwithqualifiers;

/**
 * @author kaizhang
 * @date 2021-05-19 20:11
 */
public class AutowiringWithQualifier {
    private String value;

    public AutowiringWithQualifier(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AutowiringWithQualifier{" +
                "value='" + value + '\'' +
                '}';
    }
}
