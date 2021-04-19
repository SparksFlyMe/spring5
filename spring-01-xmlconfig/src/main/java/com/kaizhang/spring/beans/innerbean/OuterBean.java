package com.kaizhang.spring.beans.innerbean;

/**
 * @author kaizhang
 * @date 2021-04-19 21:26
 */
public class OuterBean {
    private String name;

    private InnerBean innerBean;

    public void setName(String name) {
        this.name = name;
    }


    public void setInnerBean(InnerBean innerBean) {
        this.innerBean = innerBean;
    }

    @Override
    public String toString() {
        return "OuterBean{" +
                "name='" + name + '\'' +
                ", innerBean=" + innerBean +
                '}';
    }
}
