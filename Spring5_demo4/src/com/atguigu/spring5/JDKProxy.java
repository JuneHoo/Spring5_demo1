package com.atguigu.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        // 接口=代理实现对象
        UserDao user = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            Object obj;
//
//            public void InvocationHandler(Object obj) {
//                this.obj = obj;
//            }

            @Override // 匿名内部类写法！
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 方法之前
                System.out.println("Before method....." + method.getName() + " :has parameter: " + Arrays.toString(args));
                // 被增强的方法
                Object res = method.invoke(userDao, args);
                // 方法之后
                System.out.println("After method......" + userDao);
                return res;
            }
        });

        int result = user.add(1, 2);
        String id = user.update("999");
        System.out.println("id = " + id);
        System.out.println("result = " + result);
    }
}


//class UserDaoProxy implements InvocationHandler {
//
////     增强的逻辑
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        return null;
//    }
//}