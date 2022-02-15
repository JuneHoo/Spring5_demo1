package com.atguigu.spring5.bean;

public class Orders {
    private String oname;

    public Orders() {
        System.out.println("Step one: create the instance of bean");

    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("Stpe two: call set() to set value of oname");

    }

    // 创建执行的初始化方法
    public void initMethod() {
        System.out.println("Step three: init method");
    }

    public void destroyMethod() {
        System.out.println("Step five: destroy()");
    }


}
