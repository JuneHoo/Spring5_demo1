package com.atguigu.spring5.dao.impl;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value="userDaoImpl1")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add...");

    }
}
