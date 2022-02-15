package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Value(value = "abc")
    private String name;

//    // 不需要添加set方法 自动属性注入~~
//    @Autowired
//    @Qualifier(value="userDaoImpl1")
//    private UserDao userDao;
//
//    public void add() {
//        System.out.println("service add()...");
//        userDao.add();
//    }

    // 不需要添加set方法 自动属性注入~~
//    @Resource
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    public void add() {
        System.out.println("service add()..." + name);
        userDao.add();
    }
}
