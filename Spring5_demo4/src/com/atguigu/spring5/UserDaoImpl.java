package com.atguigu.spring5;

public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("add in UserDaoImpl");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update in UserDaoImpl");
        return id;
    }
}
