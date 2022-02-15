package com.atguigu.spring5;

public class User {
    private String username;
    // 写有参构造 一定要顺带写上无参构造。 否则会报错
//    public User(String username) {
//        this.username = username;
//    }

    public void add() {

        System.out.println("add successful!");
    }
}
