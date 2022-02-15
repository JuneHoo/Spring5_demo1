package com.atguigu.spring5;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

/** DL：
 * 演示使用1.set方法进行注入属性
 * 2.xml属性注入
 */
public class Book {
    private String beanName;
    private String beanAuthor;

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public Book() {
    }

    public void setBeanAuthor(String beanAuthor) {
        this.beanAuthor = beanAuthor;
    }

    // 通过有参构造 注入
    public Book(String beanName) {
        this.beanName = beanName;
    }


    public void testBook() {
        System.out.println(beanName + "::" + beanAuthor);
    }
}
