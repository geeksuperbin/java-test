package com.xiaobin.test03;

public class Test6 {
    public static void main(String[] args) {
        /**
         * Math 类
         * 包含执行基本数字运算的方法，Math类没有提供公开的构造器
         *
         */

        System.out.println(Math.abs(-1));
        System.out.println(Math.ceil(1.35)); // 2.0 向上取整
        System.out.println(Math.floor(1.35)); // 1.0 向下取整
        System.out.println(Math.round(1.35));  // 1 四舍五入
        System.out.println(Math.max(2,4)); //4
        System.out.println(Math.pow(2,3));// 8.0
        System.out.println(Math.random()); // 0.3554198126448592
    }
}
