package com.atguigu.spring5.test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class NullPointerException {
//    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length());
//        int[] arr = {1, 2, 4};
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(arr[i]);
//        }


//        A b = new B();
//        B b2 = (B) b; // 向下转型
//        C c2 = (C) b2; // ClassCastException

//        String name = "123.222";
//        int num = Integer.parseInt(name);
//        System.out.println(num);

//    }
    @Test
    public void test1() {
        // Try Catch
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("请输入一个整数：");
            String InputStr = scanner.next();
            try {
                num = Integer.parseInt(InputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("Your number is :" + num);

    }



}


class A{}

class B extends A{}

class C extends B {
}
