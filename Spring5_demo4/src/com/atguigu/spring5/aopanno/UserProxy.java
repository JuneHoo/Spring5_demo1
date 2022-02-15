package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.AfterAll;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.awt.SunHints;

//增强的类
@Component
@Aspect // 生成代理对象
// 优先级
@Order(3)
public class UserProxy {
//    相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointdemo() {

    }


    // before注解表示作为前置Advice
    @Before(value = "pointdemo()")

    public void before() {
        System.out.println("before()");
    }

    //    后置通知（返回通知）
    @AfterReturning(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("AfterReturning()");
    }

    // 最终通知
    @After(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void after() {

        System.out.println("after()");
    }

    //    异常通知
    @AfterThrowing(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing()");
    }

    //    环绕通知
    @Around(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void around() {
        System.out.println("Before Around()");
        System.out.println("After Around()");
    }

}
