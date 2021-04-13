package com.kaizhang.spring.beans;

/**
 * @author kaizhang
 * @date 2021-04-07 23:02
 */
public class Common {
    /**
     * 值
     */
    private String val;

    public void setVal(String val) {
        this.val = val;
    }

    public Common() {
        System.out.println("======= common无参构造");
    }

    @Override
    public String toString() {
        return "Common{" +
                "val='" + val + '\'' +
                '}';
    }
}
