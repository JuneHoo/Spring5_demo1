package com.atguigu.spring5.testDemo;

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.factorybean.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo01 {

    @Test
    public void testCollection1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test(); 默认是单实例模式，对象的地址一样
        System.out.println(book); // 开启多实例模式：bean标签里scope=prototype
        System.out.println(book2);
    }

    @Test
    public void testCollection3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course book = context.getBean("myBean", Course.class);
//        book.test();
        System.out.println(book);
        // 可以得到Course类型的对象， 与xml文件中定义的myBean类型不一样！！！
        // Factory 工厂bean可以实现 定义类型与返回类型不一样
    }

    @Test
    public void testCollection4() {
        System.out.println("The life of bean: ");
        System.out.println();
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
//        book.test();
        System.out.println("Step four: get the bean instance obj");
//        orders.iniMethod();
        System.out.println(orders);
        // 可以得到Course类型的对象， 与xml文件中定义的myBean类型不一样！！！
        // Factory 工厂bean可以实现 定义类型与返回类型不一样

//        Exception
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void test5() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
}
}
