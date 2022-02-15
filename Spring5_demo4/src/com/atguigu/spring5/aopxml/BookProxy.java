package com.atguigu.spring5.aopxml;

public class BookProxy {
    // 在xml文件中配置了before 作为before切点 增强到buy
    public void before() {
        System.out.println("before....");
    }
}
