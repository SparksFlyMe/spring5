package com.kaizhang.spring.beans.instantiatingbean;

/**
 * bean初始化的集中方式
 *
 * @author kaizhang
 * @date 2021-04-08 23:43
 */
public class InstantiatingBean {
    private String id;
    private String name;

    public InstantiatingBean() {
        System.out.println("InstantiatingBean无参构造");
    }

    public InstantiatingBean(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("InstantiatingBean有参构造");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
