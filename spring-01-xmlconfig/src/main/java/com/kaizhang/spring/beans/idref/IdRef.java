package com.kaizhang.spring.beans.idref;

/**
 * idRef 元素只是一种防错的方法，用于将容器中另一个bean的id(字符串值——而不是引用)传递给一个
 * < constructor-arg/> 或 < property/> 元素，用来校验有没有拼写错bean的id
 *
 * @author kaizhang
 * @date 2021-04-07 22:38
 */
public class IdRef {
    public IdRef() {
        System.out.println("======= IdRef无参构造");
    }
}
