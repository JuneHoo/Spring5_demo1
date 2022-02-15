package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.config.SpringConfig;
import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {
//    @Test
//    public void testAdd() {
//        // 1.load conf file
//
//        // 2. get the obj created by conf file
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//
//        UserService user = context.getBean("userService", UserService.class);
//        System.out.println(user);
//        user.add();
//    }

    @Test
    public void testService2() {
//      加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService user = context.getBean("userService", UserService.class);
        System.out.println(user);
        user.add();
    }

}
