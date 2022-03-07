package com.xiaobin.test03;

public class Test6 {
    public static void main(String[] args) {
        /**
         * Math 类
         * 包含执行基本数字运算的方法，Math类没有提供公开的构造器
         *
         */
        // System.out.println(Math.abs(-1));
        // System.out.println(Math.ceil(1.35)); // 2.0 向上取整
        // System.out.println(Math.floor(1.35)); // 1.0 向下取整
        // System.out.println(Math.round(1.35));  // 1 四舍五入
        // System.out.println(Math.max(2,4)); //4
        // System.out.println(Math.pow(2,3));// 8.0
        // System.out.println(Math.random()); // 0.3554198126448592
        // System.out.println(Math.random()); // 0.0 -1.0 包前不包后

        // 拓展 3 - 9 之间的随机数 （0-6）+3   【减加法】

        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
        System.out.println(ss());
    }

    public static int ss(){
        int num = (int)(Math.random()*7) + 3;
        return num;
    }



}
