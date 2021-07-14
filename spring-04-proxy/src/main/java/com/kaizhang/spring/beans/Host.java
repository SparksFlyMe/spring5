package com.kaizhang.spring.beans;

/**
 * 房东（真实角色），要出租房子
 *
 * @author kaizhang
 * @date 2021-07-11 15:58
 */
public class Host implements Rent{

    public void rent() {
        System.out.println("房屋出租");
    }
}
